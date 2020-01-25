package di.injection.injectors;

import di.injection.Consumer;
import di.injection.service.EmailServiceImpl;
import di.injection.MyDIApp;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApp(new EmailServiceImpl());
    }
}
