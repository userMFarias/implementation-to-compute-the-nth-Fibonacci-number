import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;



/**
 * A set of JUnit 5 "Jupiter" test cases for the class Fibonacci,
 * trying to achieve test coverage for the fib method.
 *
 * @author Carsten Fuhs
 */
public class FibonacciTest {

    /** Timeout in seconds for long computation. */
    private static final int LONG_TIMEOUT = 600;

    /** Timeout in seconds for short computation. */
    private static final int SHORT_TIMEOUT = 1;

    @Test
    public void test_negative_1() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fib(-1);
        });
    }

    @Test
    public void test_zero_2() {
        assertEquals(0, Fibonacci.fib(0));
    }

    @Test
    public void test_one_3() {
        assertEquals(1, Fibonacci.fib(1));
    }

    @Test
    public void test_two_4() {
        assertEquals(1, Fibonacci.fib(2));
    }

    @Test
    public void test_46_long_timeout_5() {
        assertTimeout(Duration.ofSeconds(LONG_TIMEOUT), () -> {
            assertEquals(1836311903, Fibonacci.fib(46));
        });
    }

    @Test
    public void test_46_short_timeout_6() {
        assertTimeout(Duration.ofSeconds(SHORT_TIMEOUT), () -> {
            assertEquals(1836311903, Fibonacci.fib(46));
        });
    }

    @Test
    public void test_46_long_timeout_preemptively_7() {
        assertTimeoutPreemptively(Duration.ofSeconds(LONG_TIMEOUT), () -> {
            assertEquals(1836311903, Fibonacci.fib(46));
        });
    }

    @Test
    public void test_46_short_timeout_preemptively_8() {
        assertTimeoutPreemptively(Duration.ofSeconds(SHORT_TIMEOUT), ()-> {
            assertEquals(1836311903, Fibonacci.fib(46));
        });
    }
}
