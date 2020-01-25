package v2;

import org.springframework.stereotype.Component;

@Component("speller")
public class Speller {

    public String whoIsSaying() {
        return "I am spelling";
    }
}
