package main;

import java.util.stream.IntStream;

/**
 * @author Juhi Gaba
 */
public class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {

        return number -> (number % 2 != 0);
    }

    public PerformOperation isPrime() {

        return number -> IntStream.range(2, (int) Math.sqrt(number+1))
                .noneMatch(i -> number%i == 0);
    }

    public PerformOperation isPalindrome() {

        return number -> Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString());
    }
}
