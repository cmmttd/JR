package com.javarush.task.task32.task3204;

import java.nio.CharBuffer;
import java.util.stream.Stream;

public class PasswordGenerator {

    private final static char[][] latinSet = {
            "abcdefghijklmnopqrstuvwxyz".toCharArray()
            , "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
            , "12345678901234567890123456".toCharArray()
    };

    public static String getPass() {
        String pass = "";
        while (!isValid(pass, latinSet)) {
            pass = generate(latinSet);
        }
        return pass;
    }

    private static boolean isValid(String curPass, char[][] curSet) {
        return CharBuffer.wrap(curSet[0]).chars().mapToObj(x -> "" + (char)x).anyMatch(curPass::contains)
                && CharBuffer.wrap(curSet[1]).chars().mapToObj(x -> "" + (char)x).anyMatch(curPass::contains)
                && CharBuffer.wrap(curSet[2]).chars().mapToObj(x -> "" + (char)x).anyMatch(curPass::contains);
    }

    private static String generate(char[][] curSet) {
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            pass.append(curSet[(int) (Math.random() * 3)][(int) (Math.random() * 26)]);
        }
        return pass.toString();
    }
}
