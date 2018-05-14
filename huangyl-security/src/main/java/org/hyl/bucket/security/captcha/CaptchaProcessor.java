package org.hyl.bucket.security.captcha;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * 授权验证码的处理器接口类
 */
public interface CaptchaProcessor {

    void create(ServletWebRequest request) throws Exception;

    void validate(ServletWebRequest request);
}
