package org.example.string_stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAndStringbuilder2Test {
    StringAndStringbuilder2 obj = new StringAndStringbuilder2();

    @Test
    void oz() {
        assertEquals("", obj.oz("jjjj"));
        assertTrue("oz" == obj.oz("oznvkjd"));
        assertEquals("o", obj.oz("onvkjd"));
        assertFalse("z" == obj.oz("isacn"));

    }

    @Test
    void xx() {
        assertEquals(2, obj.xx("xxx"));
        assertEquals(1, obj.xx("xx2"));
        assertTrue(2 == obj.xx("kxxmlxx"));
        assertFalse(3 == obj.xx("ksnkl"));
    }

    @Test
    void palindrome() {
    }

    @Test
    void lisOfStrings() {
    }

    @Test
    void oddOrEven() {
    }

    @Test
    void caeser() {
    }

    @Test
    void commonChars() {
    }

    @Test
    void reversedCharsInParentheses() {
    }

    @Test
    void main() {
    }
}