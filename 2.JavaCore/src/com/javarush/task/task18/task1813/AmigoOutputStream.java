package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream fs;

    public AmigoOutputStream(FileOutputStream fs) {
        this.fs = fs;
    }

    @Override
    public FileChannel getChannel() {
        return fs.getChannel();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException {
        fs.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fs.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fs.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        fs.flush();
    }

    @Override
    public void close() throws IOException {
        fs.flush();
        System.out.println("JavaRush © All rights reserved.");
        fs.close();
    }
}
