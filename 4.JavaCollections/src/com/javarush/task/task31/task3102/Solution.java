package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {

    public static List<String> getFileTree(String root) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        Queue<File> queue = new LinkedList<>();
        Collections.addAll(queue, Objects.requireNonNull(new File(root).listFiles()));

        while (!queue.isEmpty()){
            File temp = queue.remove();
            if (temp.isDirectory()) Collections.addAll(queue, Objects.requireNonNull(temp.listFiles()));
            else result.add(temp.getAbsolutePath());
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
//        String pathString = "C:\\Users\\Home\\IdeaProjects\\JavaRushTasks";
//        System.out.println(getFileTree(pathString));
    }
}
