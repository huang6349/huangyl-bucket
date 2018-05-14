package org.hyl.bucket.security.annotations;

import org.hyl.bucket.security.SecurityConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({SecurityConfiguration.class})
@ConditionalOnWebApplication
public @interface EnableSecurityModule {
}
