package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        //read dir & file path
        File argPath = new File(args[0]);
        File argFile = new File(args[1]);

        File newFile = new File(argFile.getParent() + "/allFilesContent.txt");

        FileUtils.renameFile(argFile, newFile);

        //list for files
        ArrayList<File> filesList = new ArrayList<>();

        //foo for recursive find nested directories
        findNest(argPath, filesList);

        filesList.sort(Comparator.comparing(File::getName));

        try {
            StringBuilder sb = new StringBuilder();

            //each file write to string builder
            for (File file : filesList) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                br.lines().forEach(sb::append);
                sb.append("\n");
                br.close();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
            bw.write(sb.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findNest(File dir, ArrayList<File> filesList) {
        if (dir.isDirectory()) {
            for (File temp : Objects.requireNonNull(dir.listFiles())) {
                if (temp.isDirectory())
                    findNest(temp, filesList);
                else if (temp.length() <= 50)
                    filesList.add(temp);
            }
        }
    }
}
