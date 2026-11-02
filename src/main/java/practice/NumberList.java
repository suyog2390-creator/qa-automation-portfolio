package practice;

import java.util.*;

public class NumberList {

    public static void main(String[] args) {
        List<Integer> responseTimes = new ArrayList<>(List.of(320, 150, 480, 90, 210));

        int sum = 0;
        int max = responseTimes.get(0);
        for (int t : responseTimes) {
            sum += t;
            if (t > max) max = t;
        }

        System.out.println("Total: " + sum);                       // 1250
        System.out.println("Average: " + (sum / responseTimes.size())); // 250
        System.out.println("Slowest: " + max);                     // 480

        Collections.sort(responseTimes);
        System.out.println("Sorted: " + responseTimes);

    }
}
