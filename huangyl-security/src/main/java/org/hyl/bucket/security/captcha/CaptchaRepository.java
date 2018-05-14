package org.hyl.bucket.security.captcha;

import org.hyl.bucket.security.captcha.enums.CaptchaType;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 授权验证码的数据访问类接口
 */
public interface CaptchaRepository {

    void save(ServletWebRequest request, Captcha captcha, CaptchaType type);

    Captcha get(ServletWebRequest request, CaptchaType type);

    void remove(ServletWebRequest request);
}
