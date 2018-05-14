package org.hyl.bucket.security.captcha.impl;

import org.apache.commons.lang3.StringUtils;
import org.hyl.bucket.security.captcha.*;
import org.hyl.bucket.security.captcha.enums.CaptchaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

import java.util.Map;

/**
 * 授权验证码的处理器抽象实现类
 *
 * @param <T>
 */
public abstract class AbstractCaptchaProcessor<T extends Captcha> implements CaptchaProcessor {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final Map<String, CaptchaGenerator> captchaGeneratorMap;

    private final CaptchaRepository captchaRepository;

    @Autowired
    public AbstractCaptchaProcessor(Map<String, CaptchaGenerator> captchaGeneratorMap, CaptchaRepository captchaRepository) {
        this.captchaGeneratorMap = captchaGeneratorMap;
        this.captchaRepository = captchaRepository;
    }

    @Override
    public void create(ServletWebRequest request) throws Exception {
        logger.debug("创建授权验证码");
        T t = generate();
        save(request, t);
        send(request, t);
    }

    @Override
    public void validate(ServletWebRequest request) {
        logger.debug("校验授权验证码");
        CaptchaType type = getCaptchaType();
        T t = (T) captchaRepository.get(request, type);
        String codeInRequest;
        try {
            codeInRequest = ServletRequestUtils.getStringParameter(request.getRequest(), type.getParamNameOnValidate());
        } catch (ServletRequestBindingException e) {
            e.printStackTrace();
            throw new CaptchaException(type.getParamNoteOnValidate() + "获取失败");
        }
        if (StringUtils.isBlank(codeInRequest)) {
            throw new CaptchaException(type.getParamNoteOnValidate() + "不能为空");
        }
        if (t == null) {
            throw new CaptchaException(type.getParamNoteOnValidate() + "不存在");
        }
        if (t.isExpried()) {
            captchaRepository.remove(request);
            throw new CaptchaException(type.getParamNoteOnValidate() + "已经过期");
        }
        if (!StringUtils.equalsIgnoreCase(t.getCode(), codeInRequest)) {
            throw new CaptchaException(type.getParamNoteOnValidate() + "填写错误");
        }
        captchaRepository.remove(request);
    }

    private T generate() {
        String generatorName = getCaptchaType().toString().toLowerCase() + CaptchaGenerator.class.getSimpleName();
        CaptchaGenerator captchaGenerator = captchaGeneratorMap.get(generatorName);
        if (captchaGenerator == null) {
            throw new CaptchaException("授权验证码生成器[" + generatorName + "]不存在");
        }
        return (T) captchaGenerator.generate();
    }

    private CaptchaType getCaptchaType() {
        return CaptchaType.valueOf(StringUtils.substringBefore(getClass().getSimpleName(), CaptchaProcessor.class.getSimpleName()).toUpperCase());
    }

    private void save(ServletWebRequest request, T t) {
        captchaRepository.save(request, t, getCaptchaType());
    }

    protected abstract void send(ServletWebRequest request, T t) throws Exception;
}
