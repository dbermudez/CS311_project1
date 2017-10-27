//Alexis Vidal
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
        String fileName;
        Scanner scan = new Scanner(System.in);


    private void getFileName() {
        System.out.print("Enter the filename: ");
        fileName = scan.nextLine();
        //System.out.println(fileName);
    }

    private void evaluateString(String line) {
        
        // state < 0 => dead
        int state = 0;
        for(int i = 0; i < line.length(); ++i) {

            switch(line.charAt(i)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'E':
                case 'e':
                case '+':
                case '-':
                case '.':   state = nextState(state, line.charAt(i));
                            break;
                default: state = -1;
            }

            // leave for loop if state is dead, otherwise continue evaluating string
            if (state < 0) break;
        }

        // Print out the string and whether accepted/rejected
        System.out.print(line + " ");


    }

    private int nextState(int state, char letter) {
        return 0;
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
