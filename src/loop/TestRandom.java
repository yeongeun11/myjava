package loop;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {

        Random bar1 = new Random(23);
        // Seed 값 23

        for(int i = 0 ; i < 5 ; i++) {
            double bar = Math.random();
            System.out.println(bar);
        }
    }
}
