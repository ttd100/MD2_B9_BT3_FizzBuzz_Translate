import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {
    @Test
    public void Translate0(){
        int number = 0;
        String expected = "Out of range";
        String result = FizzBuzzTranslate.translate(number);
               assertEquals(expected,result);
    }
    @Test
    public void Translate100(){
        int number = 100;
        String expected = "Out of range";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    public void Translate3(){
        int number = 3 ;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    public void Translate5(){
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    public void translate15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate13() {
        int number = 13;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate25() {
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate14() {
        int number = 14;
        String expected = "Fourteen";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }
}
