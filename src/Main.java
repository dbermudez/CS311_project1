import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
        String fileName;
        Scanner scan = new Scanner(System.in);


    private void getFileName() {
        System.out.println("Enter the filename:");
        fileName = scan.nextLine();
        //System.out.println(fileName);
    }

    private void evaluateString(String line) {
        for(int i = 0; i < line.length(); ++i) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main myClass = new Main();
        myClass.getFileName();



        try (BufferedReader b = new BufferedReader(
                new FileReader(System.getProperty("user.dir") + "/src/" + myClass.fileName))) {

            String line;
            while ((line = b.readLine()) != null) {
                //System.out.println(line);
                myClass.evaluateString(line);
            }

        }
        catch(Exception e) {
            System.out.println("File " + System.getProperty("user.dir") + "/src/" + myClass.fileName + " was not found.");
        }
    }
}
