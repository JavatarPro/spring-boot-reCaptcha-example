/*
 * @author Serhii Petrychenko / Javatar LLC
 */

package pro.javatar.captcha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static pro.javatar.captcha.CaptchaConfiguration.RECAPTCHA_RESPONSE;

@Controller
@RequestMapping("/")
public class CaptchaResource {

    private final CaptchaService captchaService;

    private final CaptchaConfiguration config;

    public CaptchaResource(CaptchaService captchaService, CaptchaConfiguration configuration) {
        this.captchaService = captchaService;
        this.config = configuration;
    }

    @GetMapping
    public String login(Model model) {
        model.addAttribute("siteKey", config.getSiteKey());
        return "captcha";
    }

    @PostMapping
    public String login(
            @RequestParam(value = RECAPTCHA_RESPONSE) String gResponse,
            Model model
    ) {
        String status = "Captcha is valid";
        try {
            captchaService.validate(gResponse);
        } catch (Exception e) {
            status = "Captcha is not valid";
        }
        model.addAttribute("siteKey", config.getSiteKey());
        model.addAttribute("captchaStatus", status);
        return "captcha";
    }
}
