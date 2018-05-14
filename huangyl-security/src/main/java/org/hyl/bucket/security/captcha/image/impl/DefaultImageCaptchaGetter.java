package org.hyl.bucket.security.captcha.image.impl;

import org.hyl.bucket.security.captcha.image.ImageCaptcha;
import org.hyl.bucket.security.captcha.image.ImageCaptchaGetter;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import java.io.IOException;

public class DefaultImageCaptchaGetter implements ImageCaptchaGetter {

    @Override
    public void get(ServletWebRequest request, ImageCaptcha imageCaptcha) throws IOException {
        ServletOutputStream out = request.getResponse().getOutputStream();
        ImageIO.write(imageCaptcha.getImage(), "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
    }
}
