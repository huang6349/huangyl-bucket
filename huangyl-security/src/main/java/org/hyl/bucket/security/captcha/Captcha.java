package org.hyl.bucket.security.captcha;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 授权验证码的实体类，授权验证码的创建和校验都会用到它
 */
public class Captcha implements Serializable {

    private static final long serialVersionUID = -6031870407057896469L;

    private String code;

    private LocalDateTime expireTime;

    public Captcha(String code, int expireIn) {
        super();
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public Captcha(String code, LocalDateTime expireTime) {
        super();
        this.code = code;
        this.expireTime = expireTime;
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(this.expireTime);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
    }
}
