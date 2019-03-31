package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class onlyFiles {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");

        Files.walk(Paths.get(userDir))
                .filter(Files::isRegularFile)
                .forEach(System.out::println);

    }
}
