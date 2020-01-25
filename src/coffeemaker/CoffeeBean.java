package coffeemaker;

import org.springframework.stereotype.Component;

@Component
public class CoffeeBean {

    public void getCoffeeBeans() {
        System.out.println("Added coffee beans");
    }
}
