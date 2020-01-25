package v2;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @EventListener
    public void handleEvent(ContextRefreshedEvent event) {
        System.out.println("Context refreshed in: " + event.getTimestamp());
    }
}
