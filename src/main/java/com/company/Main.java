package com.company;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        File homeDir = new File(userDir);
        if (homeDir.exists() && homeDir.isDirectory()) {
            File[] files = homeDir.listFiles();
            for (File file : files) {
                //System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                if (file.getName().equals("test.txt")) {
                    file.delete();
                }

            }
        }
    }
}
