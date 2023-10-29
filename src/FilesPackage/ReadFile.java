package FilesPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File filepath = new File("filename.txt");
            Scanner myReader = new Scanner(filepath);
            while (myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();


        }catch (FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }


}
