package org.example.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    String str = new String();
    String a = "skkln";
    String b = null;
    String empty = "";

    @Test
    void length() {
        assertEquals(5, "dvjnn".length());
        assertTrue(2 == "23".length());
        assertFalse(5 == "nks".length());
        assertTrue("".length() == 0);
    }

    @Test
    void isEmpthy() {
        assertTrue(empty.isEmpty());
        assertFalse(a.isEmpty());
        assertNotEquals(true, a.isEmpty());
        assertEquals(true, empty.isEmpty());
        assertNotNull(a);
    }

    @Test
    void chartAt() throws Exception {
        assertTrue(a.charAt(0) == 's');
        boolean condition = false;
        try {
            b.charAt(0);
        } catch (NullPointerException e) {
            condition = true;
            assertTrue(condition); // ete mtnum e catch
        }
    }

    @Test
    void indexOf(){
        assertEquals(0, a.indexOf('s'));
        assertTrue(3 == a.indexOf('l'));
    }

}
