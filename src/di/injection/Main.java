package di.injection;

import di.injection.injectors.EmailServiceInjector;
import di.injection.injectors.MessageServiceInjector;
import di.injection.injectors.SMSServiceInjector;

public class Main {

    public static void main(String[] args) {

        MessageServiceInjector messageServiceInjector;

        Consumer consumer;

        String receiver = "test@test";

        String message = "Hello there";

        // send via email
        messageServiceInjector = new EmailServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessages(message, receiver);

        // send via SMS
        messageServiceInjector = new SMSServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessages(message, receiver);
    }
}
