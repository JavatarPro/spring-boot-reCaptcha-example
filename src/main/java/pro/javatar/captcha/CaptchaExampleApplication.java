/*
 * @author Serhii Petrychenko / Javatar LLC
 */

package pro.javatar.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableConfigurationProperties
@EnableWebMvc
public class CaptchaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaptchaExampleApplication.class, args);
    }

    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
