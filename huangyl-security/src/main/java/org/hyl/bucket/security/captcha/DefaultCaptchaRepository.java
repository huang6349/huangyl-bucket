package org.hyl.bucket.security.captcha;

import org.hyl.bucket.security.captcha.enums.CaptchaType;
import org.springframework.web.context.request.ServletWebRequest;

public class DefaultCaptchaRepository implements CaptchaRepository {

    @Override
    public void save(ServletWebRequest request, Captcha captcha, CaptchaType type) {
        throw new RuntimeException("请实现[CaptchaRepository]接口，完成验证码的保存逻辑");
    }

    @Override
    public Captcha get(ServletWebRequest request, CaptchaType type) {
        throw new RuntimeException("请实现[CaptchaRepository]接口，完成验证码的获取逻辑");
    }

    @Override
    public void remove(ServletWebRequest request) {
        throw new RuntimeException("请实现[CaptchaRepository]接口，完成验证码的移除逻辑");
    }
}
