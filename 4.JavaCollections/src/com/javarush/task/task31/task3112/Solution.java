package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt"
                , Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL link = new URL(urlString);
        Path temp = Files.createTempFile("temp", ".tmp");
        Files.copy(link.openStream(), temp, StandardCopyOption.REPLACE_EXISTING);
        Path result = Paths.get(downloadDirectory.toString(), Paths.get(link.getPath()).getFileName().toString());
        Files.move(temp, result, StandardCopyOption.REPLACE_EXISTING);
        return result;
    }
}
