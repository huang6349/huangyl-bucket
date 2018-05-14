package org.hyl.bucket.security.captcha;

import org.hyl.bucket.security.captcha.image.ImageCaptchaGenerator;
import org.hyl.bucket.security.captcha.image.ImageCaptchaGetter;
import org.hyl.bucket.security.captcha.image.impl.DefaultImageCaptchaGetter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 授权验证码的[baen]配置类
 */
@Configuration
public class CaptchaBeanConfig {

    @Bean
    @ConditionalOnMissingBean(name = "imageCaptchaGenerator")
    public CaptchaGenerator imageCaptchaGenerator() {
        return new ImageCaptchaGenerator();
    }

    @Bean
    @ConditionalOnMissingBean(ImageCaptchaGetter.class)
    public ImageCaptchaGetter imageCaptchaGetter() {
        return new DefaultImageCaptchaGetter();
    }

    @Bean
    @ConditionalOnMissingBean(CaptchaRepository.class)
    public CaptchaRepository captchaRepository() {
        return new DefaultCaptchaRepository();
    }
}
