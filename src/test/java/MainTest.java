import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    // here
    @Test
    void calculateSum_when3And5_return8() {
        //GIVEN
        int a = 3;
        int b = 5;
        //WHEN
        int actual = Main.calculateSum(a, b);
        //THEN
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isEvenNumber_returnTrue_whenNumberIsEven() {
        //GIVEN
        int number = 2;
        //WHEN
        boolean actual = Main.isEvenNumber(number);
        //THEN
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiplicate_return10_whenNumber2nd5() {
        //GIVEN
        int a = 2;
        int b = 5;
        //WHEN
        int actual = Main.multiplicate(a, b);
        //THEN
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void makeUppercase_returnUppercase_whenCharsAreLower() {
        //GIVEN
        String word = "fail";
        //WHEN
        String actual = Main.makeUppercase(word);
        //THEN
        String expected = "FAIL";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIfPositive_returnTrue_whenNumberIs10() {
        //GIVEN
        int number = 10;
        //WHEN
        boolean actual = Main.checkIfPositive(number);
        //THEN
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}