import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YesOrNoTest {

    @Test
    void boolToWord() {
        assertEquals("Yes",YesOrNo.boolToWord(true));
        assertEquals("No",YesOrNo.boolToWord(false));
    }
    @Test
    void badTovalid(){
        BigCounting bigCounting = new BigCounting();
        assertNotEquals("Yes","yes");
        assertNotEquals("Yes",4);
    }
}