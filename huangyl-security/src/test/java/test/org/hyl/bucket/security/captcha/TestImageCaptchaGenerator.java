package test.org.hyl.bucket.security.captcha;

import com.google.code.kaptcha.Producer;
import org.hyl.bucket.security.captcha.Captcha;
import org.hyl.bucket.security.captcha.CaptchaGenerator;
import org.hyl.bucket.security.captcha.image.ImageCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.image.BufferedImage;

@Component("imageCaptchaGenerator")
public class TestImageCaptchaGenerator implements CaptchaGenerator {

    @Autowired
    private Producer defaultKaptcha;

    @Override
    public Captcha generate() {
        String capText = defaultKaptcha.createText();
        int expireIn = 300;
        BufferedImage bi = defaultKaptcha.createImage(capText);
        return new ImageCaptcha(capText, expireIn, bi);
    }
}
