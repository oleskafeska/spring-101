package di.injection.service;

import di.injection.service.MessageService;

public class SMSServiceImpl implements MessageService {

    @Override
    public void sendMessage(String message, String receiver) {

        System.out.println("Sent SMS to " + receiver + " with message: " + message);
    }
}
