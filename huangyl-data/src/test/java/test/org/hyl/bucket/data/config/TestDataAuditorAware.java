package test.org.hyl.bucket.data.config;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("hylDataAuditorAware")
public class TestDataAuditorAware implements AuditorAware<String> {

    @Override
    public String getCurrentAuditor() {
        return "SYSTEM";
    }
}
