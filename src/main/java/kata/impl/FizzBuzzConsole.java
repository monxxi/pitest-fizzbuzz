package kata.impl;

import kata.FizzBuzz;

import java.util.Arrays;

public class FizzBuzzConsole implements FizzBuzz {
    @Override
    public String determine(String valueToAnalyse) {
        try {

            Integer value = getIntegerValue(valueToAnalyse);
            if (isDivisibleBy(value,5,3)) {
                return "FizzBuzz";
            }
            if (isDivisibleBy(value,5)) {
                return "Fizz";
            }
            if (isDivisibleBy(value,3)) {
                return "Buzz";
            }
            return value.toString();

        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(ex);
        }
    }

    private boolean isDivisibleBy(int value, Integer ...divisors) {
        return Arrays.stream(divisors)
                .map(divisor -> value % divisor == 0)
                .filter(result -> result==false).count() <= 0;
    }

    private Integer getIntegerValue(String valueToAnalyse) {
        return Integer.valueOf(valueToAnalyse);
    }
}
