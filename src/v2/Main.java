package v2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("v2");

        System.out.println("Beans created: " + ctx.getBeanDefinitionCount());

        for (String name : ctx.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        // get bean by name
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("hello2");

        // get bean by class
//        HelloWorldImpl beanByClass = ctx.getBean(HelloWorldImpl.class);
//        beanByClass.sayHello();

        String[] beanNamesForAnnotation = ctx.getBeanNamesForAnnotation(Component.class);

        System.out.println("-----------------------");
        System.out.println("Beans annotated as Component");

        for (String name : beanNamesForAnnotation) {

            System.out.println(name);
        }

        System.out.println("-----------------------");
        System.out.println("Calling bean");

        helloWorld.sayHello();
    }
}
