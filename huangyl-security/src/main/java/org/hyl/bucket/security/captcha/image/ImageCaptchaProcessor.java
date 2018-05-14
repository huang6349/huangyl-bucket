package org.hyl.bucket.security.captcha.image;

import org.hyl.bucket.security.captcha.CaptchaGenerator;
import org.hyl.bucket.security.captcha.CaptchaRepository;
import org.hyl.bucket.security.captcha.impl.AbstractCaptchaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import java.util.Map;

@Component("imageCaptchaProcessor")
public class ImageCaptchaProcessor extends AbstractCaptchaProcessor<ImageCaptcha> {

    private final ImageCaptchaGetter imageCaptchaGetter;

    @Autowired
    public ImageCaptchaProcessor(Map<String, CaptchaGenerator> captchaGeneratorMap, CaptchaRepository captchaRepository, ImageCaptchaGetter imageCaptchaGetter) {
        super(captchaGeneratorMap, captchaRepository);
        this.imageCaptchaGetter = imageCaptchaGetter;
    }

    @Override
    protected void send(ServletWebRequest request, ImageCaptcha imageCaptcha) throws Exception {
        imageCaptchaGetter.get(request, imageCaptcha);
    }
}
