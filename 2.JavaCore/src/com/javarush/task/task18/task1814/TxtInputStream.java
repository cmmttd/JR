package com.javarush.task.task18.task1814;

import java.io.*;
import java.nio.channels.FileChannel;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    private FileInputStream fis;

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
        fis = new FileInputStream(fileName);
    }

    public TxtInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public TxtInputStream(FileDescriptor fdObj) {
        super(fdObj);
    }

    @Override
    public int read() throws IOException {
        return fis.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return fis.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return fis.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return fis.skip(n);
    }

    @Override
    public int available() throws IOException {
        return fis.available();
    }

    @Override
    public void close() throws IOException {
        fis.close();
    }

    @Override
    public FileChannel getChannel() {
        return fis.getChannel();
    }

    public static void main(String[] args) throws UnsupportedFileNameException, IOException {
//        TxtInputStream t = new TxtInputStream("C:\\Repositories\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1808\\data.tx");
//        while (t.available() > 0){
//            System.out.println(t.read());
//        }
//        t.close();
    }
}

