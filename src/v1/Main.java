package v1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld bean = context.getBean(HelloWorld.class);

        bean.sayHello();
    }
}
