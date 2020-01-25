package coffeemaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Maker {

    private Water water;

    private CoffeeBean coffeeBean;

    @Autowired
    public Maker(Water water, CoffeeBean coffeeBean) {
        this.water = water;
        this.coffeeBean = coffeeBean;
    }

    public void makeCoffee() {
        water.getWater();
        coffeeBean.getCoffeeBeans();
        System.out.println("Coffee is ready");
    }
}
