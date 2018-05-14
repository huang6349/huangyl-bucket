package test.org.hyl.bucket.security.captcha;

import org.hyl.bucket.security.captcha.Captcha;
import org.hyl.bucket.security.captcha.CaptchaRepository;
import org.hyl.bucket.security.captcha.enums.CaptchaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

@Component
public class TestCaptchaRepository implements CaptchaRepository {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void save(ServletWebRequest request, Captcha captcha, CaptchaType type) {
        logger.info("保存授权验证码[" + captcha.getCode() + "]");
    }

    @Override
    public Captcha get(ServletWebRequest request, CaptchaType type) {
        logger.info("获取授权验证码");
        return null;
    }

    @Override
    public void remove(ServletWebRequest request) {
        logger.info("移除授权验证码");
    }
}
