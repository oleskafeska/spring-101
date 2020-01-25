package v3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @Autowired
    public void sayHello() {
        System.out.println("Hello from annotated method!");
    }
}
