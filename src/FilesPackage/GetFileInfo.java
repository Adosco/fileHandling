package FilesPackage;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File file = new File("filename.txt");

        if (file.exists()){
            System.out.println("Filename: " + file.getName());
            System.out.println("File Absolute path:" + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canWrite());
            System.out.println("File size in byte:" + file.length());

        }else {
            System.out.println("The file does not exist.");
        }

    }
}
