import org.junit.jupiter.api.Test;
import exercise.BigCounting;

import static org.junit.jupiter.api.Assertions.*;

class BigCountingTest {

    @Test
    void countBits() {

        assertEquals(5, BigCounting.countBits(1234));
        assertEquals(1, BigCounting.countBits(4));
        assertEquals(3, BigCounting.countBits(7));
        assertEquals(2, BigCounting.countBits(9));
        assertEquals(2, BigCounting.countBits(10));
    }
}