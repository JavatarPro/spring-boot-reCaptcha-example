# Spring Boot reCaptcha example

This is example of google reCaptcha usage with spring boot.

## HowTo try

1. Download and compile [spring-boot-reCaptcha library](https://github.com/JavatarPro/spring-boot-reCaptcha). Run command **mvn clean install**
2. Download [spring-boot-reCaptcha-example sources](https://github.com/JavatarPro/spring-boot-reCaptcha-example)
3. Goto [reCaptcha page](https://www.google.com/recaptcha/admin). Create new captcha and copy **siteKey** and **secretKey**
4. Replace **siteKey** and **secretKey** in the **application.yml** 
5. Run **CaptchaExampleApplication**
6. Open http://localhost:8099 page in your favorite browser (port could be changed in the application.yml)
7. Enjoy)