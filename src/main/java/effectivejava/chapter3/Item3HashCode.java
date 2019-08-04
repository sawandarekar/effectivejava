package effectivejava.chapter3;

import java.util.HashMap;
import java.util.Map;

public class Item3HashCode {

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        String s = m.get(new PhoneNumber(707, 867, 5309));
        System.out.println("S:"+s); // if no
    }
}
