package com.gradlehero.languageapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SayHello {
    public static void main(String ...args) throws IOException {
        String lang=args[0];
        InputStream is=SayHello.class.getClassLoader().getResourceAsStream(lang+".txt");
        assert  is!=null;
        BufferedReader reader=new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
        System.out.println(reader.readLine());
    }
}
