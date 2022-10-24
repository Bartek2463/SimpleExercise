import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class IsEvenTest {


    @Test
    void isEven() {
        assertEquals("cba",IsEven.isEven("ab12?!c"));

    }
    @Test
    void isNotEven(){
        assertNotEquals("CBA",IsEven.isEven("ab12?!c"));
    }
}