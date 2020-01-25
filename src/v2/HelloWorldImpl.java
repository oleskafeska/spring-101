package v2;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorldImpl implements HelloWorld {

    public void sayHello() {
        System.out.println("Hello World");
    }
}
