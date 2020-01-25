package coffeemaker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

        Maker coffeeMaker = ctx.getBean(Maker.class);

        coffeeMaker.makeCoffee();
    }
}
