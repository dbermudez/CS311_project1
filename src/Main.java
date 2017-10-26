import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
        String fileName;
        Scanner scan = new Scanner(System.in);


    public void getFileName() {
        System.out.println("Enter the filename:");
        fileName = scan.nextLine();
        //System.out.println(fileName);
    }


    public static void main(String[] args) {
        Main myClass = new Main();
        myClass.getFileName();



        try (BufferedReader b = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/" + myClass.fileName))) {

            String line;
            while ((line = b.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch(Exception e) {
            System.out.println("File " + System.getProperty("user.dir") + "/src/" + myClass.fileName + " was not found.");
        }
    }
}
