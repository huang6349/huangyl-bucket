package org.hyl.bucket.security.captcha;

import org.hyl.bucket.security.captcha.enums.CaptchaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 授权验证码处理器的服务提供类
 */
@Component
public class CaptchaProcessorProvice {

    private final Map<String, CaptchaProcessor> captchaProcessorMap;

    @Autowired
    public CaptchaProcessorProvice(Map<String, CaptchaProcessor> captchaProcessorMap) {
        this.captchaProcessorMap = captchaProcessorMap;
    }

    CaptchaProcessor findCaptchaProcessor(CaptchaType type) {
        return findCaptchaProcessor(type.toString().toLowerCase());
    }

    CaptchaProcessor findCaptchaProcessor(String type) {
        String name = type.toLowerCase() + CaptchaProcessor.class.getSimpleName();
        CaptchaProcessor captchaProcessor = captchaProcessorMap.get(name);
        if (captchaProcessor == null) {
            throw new CaptchaException("验证码处理器[" + name + "]不存在");
        }
        return captchaProcessor;
    }
}
