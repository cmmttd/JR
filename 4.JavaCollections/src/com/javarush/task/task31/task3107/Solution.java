package com.javarush.task.task31.task3107;

import java.nio.file.Files;
import java.nio.file.Paths;

/*
Null Object Pattern
*/
public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            this.fileData = new ConcreteFileData(
                    Files.isHidden((Paths.get(pathToFile))),
                    Files.isExecutable((Paths.get(pathToFile))),
                    Files.isDirectory((Paths.get(pathToFile))),
                    Files.isWritable((Paths.get(pathToFile)))
            );
        } catch (Exception e) {
            this.fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }

    public static void main(String[] args) {
        System.out.println(new Solution("qwe.txt"));
    }
}