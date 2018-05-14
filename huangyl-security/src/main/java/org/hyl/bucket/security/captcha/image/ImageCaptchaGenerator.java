package org.hyl.bucket.security.captcha.image;

import org.hyl.bucket.security.captcha.Captcha;
import org.hyl.bucket.security.captcha.CaptchaGenerator;

public class ImageCaptchaGenerator implements CaptchaGenerator {

    @Override
    public Captcha generate() {
        throw new RuntimeException("请实现[CaptchaGenerator]接口，实现[imageCaptchaGenerator][bean]，完成图形验证码的生成逻辑");
    }
}
