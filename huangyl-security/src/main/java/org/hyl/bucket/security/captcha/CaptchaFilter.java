package org.hyl.bucket.security.captcha;

import org.apache.commons.lang3.StringUtils;
import org.hyl.bucket.security.captcha.enums.CaptchaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 授权验证码的过滤器
 */
@Component
public class CaptchaFilter extends OncePerRequestFilter implements InitializingBean {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final AuthenticationFailureHandler authenticationFailureHandler;

    private final CaptchaProcessorProvice captchaProcessorProvice;

    private Map<String, CaptchaType> urlMap = new HashMap<>();

    private AntPathMatcher pathMatcher = new AntPathMatcher();

    @Autowired
    public CaptchaFilter(AuthenticationFailureHandler authenticationFailureHandler, CaptchaProcessorProvice captchaProcessorProvice) {
        this.authenticationFailureHandler = authenticationFailureHandler;
        this.captchaProcessorProvice = captchaProcessorProvice;
    }

    @Override
    public void afterPropertiesSet() throws ServletException {
        super.afterPropertiesSet();

        urlMap.put("/uua", CaptchaType.IMAGE);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        CaptchaType type = getCaptchaType(request);
        if (type != null) {
            logger.debug("校验请求[" + request.getRequestURI() + "]中的验证码，验证码类型为" + type);
            try {
                captchaProcessorProvice.findCaptchaProcessor(type).validate(new ServletWebRequest(request, response));
            } catch (CaptchaException e) {
                authenticationFailureHandler.onAuthenticationFailure(request, response, e);
                return;
            }
        }
        chain.doFilter(request, response);
    }

    /**
     * 获取校验码的类型
     *
     * @param request 请求
     * @return 如果当前请求不需要校验，则返回null
     */
    private CaptchaType getCaptchaType(HttpServletRequest request) {
        CaptchaType type = null;
        if (!StringUtils.equalsIgnoreCase(request.getMethod(), "GET")) { // 拦截非GET请求
            Set<String> urls = urlMap.keySet();
            for (String url : urls) {
                if (pathMatcher.match(url, request.getRequestURI())) {
                    type = urlMap.get(url);
                }
            }
        }
        return type;
    }
}
