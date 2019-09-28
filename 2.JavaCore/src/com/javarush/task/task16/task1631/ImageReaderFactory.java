package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import static com.javarush.task.task16.task1631.common.ImageTypes.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes it) {

        if (JPG.equals(it)) return new JpgReader();
        else if (BMP.equals(it)) return new BmpReader();
        else if (PNG.equals(it)) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
