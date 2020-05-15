
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Saul Diosdado
 */
public class Cases {

    public static void main(String[] args) throws FileNotFoundException {
        final String REGEX = "[a-zA-Z]+";
        
        final File testCaseFile = new File("testCaseFile.txt");
        
        final Scanner inputChoice = new Scanner(System.in);
        final Scanner scan;
        
        System.out.print("Enter 0 for System.in, anything else for file input: ");
        
        if (inputChoice.nextInt() == 0) {
            scan = new Scanner(System.in);
        } else {
            scan = new Scanner(testCaseFile);
        }
        
        while (scan.hasNext()) {
            String testCase = scan.nextLine();
            
            if (testCase.matches(REGEX)) {
                System.out.println("PASS: " + testCase);
            } else {
                System.out.println("FAIL: " + testCase);
            }
        }
    }
    
}
