package di.injection.injectors;

import di.injection.Consumer;
import di.injection.MyDIApp;
import di.injection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApp(new SMSServiceImpl());
    }
}
