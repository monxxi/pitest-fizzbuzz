package kata.impl;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConsoleTest {
    FizzBuzzConsole fizzBuzzConsole = new FizzBuzzConsole();
    /**
     * test list:
     * should accept only string of integer
     * should return String of integer
     */

    @Test
    public void shouldNotAcceptAStringNotIntegerParsable() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> fizzBuzzConsole.determine("a"));
    }

    @Test
    public void shouldReturnStringOfValue() {
        assertThat(fizzBuzzConsole.determine("1"), equalTo("1"));
    }

    @Test
    public void shouldReturnFizz_whenInputIsDividedBy5() {
        assertThat(fizzBuzzConsole.determine("5"), equalTo("Fizz"));

    }

    @Test
    public void shouldReturnFizz_whenInputIsDividedBy3() {
        assertThat(fizzBuzzConsole.determine("3"), equalTo("Buzz"));

    }

    @Test
    public void shouldReturnFizzBuzz_whenInputIsDividedBy3And5() {
        assertThat(fizzBuzzConsole.determine("15"), equalTo("FizzBuzz"));

    }


}