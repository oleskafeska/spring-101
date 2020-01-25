package di.injection;

import di.injection.service.MessageService;

public class MyDIApp implements Consumer {

    private MessageService messageService;

    // constructor injection
    public MyDIApp(MessageService messageService) {
        this.messageService = messageService;
    }
    @Override
    public void processMessages(String message, String receiver) {
        this.messageService.sendMessage(message, receiver);
    }
}
