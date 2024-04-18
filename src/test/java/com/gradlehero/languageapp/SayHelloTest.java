package com.gradlehero.languageapp;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SayHelloTest {
    @Test
    public void testSayHello() throws IOException {
        SayHello.main("en");
    }
}
