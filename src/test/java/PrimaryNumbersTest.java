import dm.primary_numbers.PrimaryNumbers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimaryNumbersTest {

    @Test
    public void zeroIsNotPrime() {
        PrimaryNumbers number = new PrimaryNumbers();
        boolean result = number.isItPrime(0);
        assertFalse(result);
    }

    @Test
    public void oneIsNotPrime() {
        PrimaryNumbers number = new PrimaryNumbers();
        boolean result = number.isItPrime(1);
        assertFalse(result);
    }

    @Test
    public void twoIsPrime() {
        PrimaryNumbers number = new PrimaryNumbers();
        boolean result = number.isItPrime(2);
        assertTrue(result);
    }

    @Test
    public void threeIsNotDivisibleByTwo() {
        PrimaryNumbers number = new PrimaryNumbers();
        boolean result = number.isItPrime(3);
        assertTrue(result);
    }

    @Test
    public void numberIsNotPrime() {
        PrimaryNumbers number = new PrimaryNumbers();
        boolean result = number.isItPrime(50);
        assertFalse("first value", result);
        result = number.isItPrime(45);
        assertFalse("second value", result);
    }

    @Test
    public void numberIsPrime() {
        PrimaryNumbers number = new PrimaryNumbers();
        boolean result = number.isItPrime(13);
        assertTrue("first value", result);
        result = number.isItPrime(17);
        assertTrue("second value", result);
    }

    @Test
    public void returnsAListOfTwoNumbers() {
        PrimaryNumbers numbers = new PrimaryNumbers();
        List<Integer> list = numbers.primes(2);
        List<Integer> answer = Arrays.asList(2, 3);
        assertThat(list, is(answer));
    }

    @Test
    public void returnsAListOfPrimeNumbers() {
        PrimaryNumbers numbers = new PrimaryNumbers();
        List<Integer> list = numbers.primes(4);
        List<Integer> answer = Arrays.asList(2, 3, 5, 7);
        assertThat(list, is(answer));
    }

}
