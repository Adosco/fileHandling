import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        try {
            File myFile = new File("C:\\Users\\adoex.LAPTOP-8K8GGC7B\\Desktop\\myFolder\\filename.txt");
            if (myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
                System.out.println("Absolute file path: " + myFile.getAbsolutePath());
            }
            else {
                System.out.println("File already exist");
            }

        }catch (IOException e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }




    }
}