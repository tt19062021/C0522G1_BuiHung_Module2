package SS16_IO_BinaryFile_Serialization.Exercise.view;


import SS16_IO_BinaryFile_Serialization.Exercise.exception.FileExistsException;
import SS16_IO_BinaryFile_Serialization.Exercise.until.CopyFile;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File sourceFile;
        File destFile;
        try {
            sourceFile = new File("src/SS16_IO_BinaryFile_Serialization/Exercise/until/source.csv");
            destFile = new File("src/SS16_IO_BinaryFile_Serialization/Exercise/until/target.csv");
            if (destFile.exists()) {
                throw new FileExistsException("File đã tồn tại !!!");
            }
            CopyFile.copyFileUsingJava7Files(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (FileExistsException | IOException e) {
            e.printStackTrace();
        }
    }
}
