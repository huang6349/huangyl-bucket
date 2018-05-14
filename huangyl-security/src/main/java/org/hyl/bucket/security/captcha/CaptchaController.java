package org.hyl.bucket.security.captcha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 授权验证码的控制器类
 */
@RestController
public class CaptchaController {

    private final AuthenticationFailureHandler authenticationFailureHandler;

    private final CaptchaProcessorProvice captchaProcessorProvice;

    @Autowired
    public CaptchaController(AuthenticationFailureHandler authenticationFailureHandler, CaptchaProcessorProvice captchaProcessorProvice) {
        this.authenticationFailureHandler = authenticationFailureHandler;
        this.captchaProcessorProvice = captchaProcessorProvice;
    }

    @GetMapping("/captcha/{type}")
    public void create(HttpServletRequest request, HttpServletResponse response, @PathVariable String type) throws Exception {
        try {
            captchaProcessorProvice.findCaptchaProcessor(type).create(new ServletWebRequest(request, response));
        } catch (CaptchaException e) {
            authenticationFailureHandler.onAuthenticationFailure(request, response, e);
        }
    }
}
