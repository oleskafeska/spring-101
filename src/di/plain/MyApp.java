package di.plain;

public class MyApp {

    public static void main(String[] args) {

        EmailService emailService = new EmailService();

        emailService.sendEmail("Hello world!", "test@test");
    }

    /**Cons of this approach:
     * - MyDIApp is responsible to initialize EmailServiceImpl. This leads to hardcoded dependency
     * - if we want to extend application to provide additional logic (f.e. send SMS),
     * then we need to write another app. This will involve huge code changes
     * - testing will be difficult */
}
