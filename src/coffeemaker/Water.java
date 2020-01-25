package coffeemaker;

import org.springframework.stereotype.Component;

@Component
public class Water {

    public void getWater() {
        System.out.println("Added water");
    }
}
