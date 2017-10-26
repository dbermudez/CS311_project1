import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
        String fileName;
        Scanner scan = new Scanner(System.in);


    //public Main () {
    //}

    public void getFileName() {
        System.out.println("Enter the filename:");
        fileName = scan.nextLine();
        System.out.println(fileName);
    }

    // prompt for path
    // open file
    // echo file to screen
    public static void main(String[] args) {
        Main myClass = new Main();
        myClass.getFileName();

        try (BufferedReader b = new BufferedReader(new FileReader(myClass.fileName))) {

        }
        catch(Exception e) {
            //do something
        }
    }
}
