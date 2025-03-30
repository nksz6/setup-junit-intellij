package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeTest {

    @Test
    public void testSayHello() {
        Code code = new Code(); //create insatnce of code to test it
        //gonna test if expected value and actual value match...
        assertEquals("Hello World!", code.sayHello());
    }
    //now trying a test that will fail
    @Test
    public void testSayHelloFail() {
        Code code2 = new Code();
        assertNotEquals("Hello World", code2.sayHello());
    }
}
