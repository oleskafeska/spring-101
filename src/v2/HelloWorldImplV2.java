package v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// means that this class is bean.
@Component("hello2")
public class HelloWorldImplV2 implements HelloWorld {

    private final Speller speller;

    // constructor injection using annotation @Autowired
    @Autowired
    public HelloWorldImplV2(Speller speller) {
        this.speller = speller;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello world Version 2" + "\n" + speller.whoIsSaying());
    }
}
