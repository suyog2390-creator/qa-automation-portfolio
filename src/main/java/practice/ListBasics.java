package practice;

import java.util.*;

public class ListBasics {

    public static void main(String[] args) {
        {
            List<String> browsers = new ArrayList<>();
            browsers.add("SUYOG");
            browsers.add("Firefox");
            browsers.add("Edge");

            System.out.println("First: " + browsers.get(0));          // Chrome
            browsers.set(1, "Safari");                                // replace Firefox
            browsers.remove("Edge");                                  // remove by value
            System.out.println("Has Chrome? " + browsers.contains("Chrome"));
            System.out.println("Size: " + browsers.size());           // 2
            System.out.println(browsers);                         // [Chrome, Safari]
        }
    }	// TODO Auto-generated method stub

}
