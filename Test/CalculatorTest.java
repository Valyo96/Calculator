import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Scanner sc=new Scanner(System.in);
    @org.junit.jupiter.api.Test
    void sum() {
        Calculator.sum(UserInput.numbers(sc),UserInput.numbers(sc));
        int expected=UserInput.numbers(sc)+UserInput.numbers(sc);
        assertEquals(expected, Calculator.sum(UserInput.numbers(sc),UserInput.numbers(sc)));
    }
}