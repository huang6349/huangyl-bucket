package org.hyl.bucket.security.captcha.image;

import org.hyl.bucket.security.captcha.Captcha;

import java.awt.image.BufferedImage;

/**
 * 图形验证码的实体类
 */
public class ImageCaptcha extends Captcha {

    private static final long serialVersionUID = -825145745226185454L;

    private BufferedImage image;

    public ImageCaptcha(String code, int expireIn, BufferedImage image) {
        super(code, expireIn);
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
