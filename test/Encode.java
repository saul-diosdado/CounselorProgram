
import java.util.Scanner;

/**
 *
 * @author Saul Diosdado
*/
public class Encode {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text to be tested: ");
        final String  INPUT  = scan.next();
        final String  ENCODE = encode(INPUT);
        final int     CALC   = algorithm(INPUT.length());
        final String  DECODE = decode(ENCODE);
        final boolean MATCH  = INPUT.equals(DECODE);
        
        scan.close();
        
        System.out.println("Encode:\t" + ENCODE);
        System.out.println("Calc:\t"   + CALC);
        System.out.println("Decode:\t" + DECODE);
        System.out.println("Match:\t"  + MATCH);
    }
    
    public static String decode(String input) {
        int enCount = 0;
        
        Scanner lengthScanner = new Scanner(input);
        
        while (lengthScanner.hasNext()) {
            enCount++;
            lengthScanner.next();
        }
        
        int algorithmCalc = algorithm(enCount);
        
        Scanner fieldScanner = new Scanner(input);
        
        StringBuilder decodedField = new StringBuilder();
        
        for (int i = 0; i < enCount; i++) {
            String binaryString = fieldScanner.next();
            int decimalValue = Integer.parseInt(binaryString, 2);
            int asciiValue = decimalValue - algorithmCalc;
            
            if (asciiValue < 0) {
                asciiValue = 128 - Math.abs(asciiValue);
            }
            
            decodedField.append(Character.toString((char) asciiValue));
        }
        
        return decodedField.toString();
    }
    
    private static String encode(String input) {
        int enCount = input.length();
        int algorithmCalc = algorithm(enCount);
        
        char[] userArray = input.toCharArray();
        
        StringBuilder encodedField = new StringBuilder();
        StringBuilder startAsciiBuilder = new StringBuilder();
        StringBuilder finalAsciiBuilder = new StringBuilder();
        
        for (int i = 0; i < enCount; i++) {
            int asciiValue = (int) userArray[i];
            startAsciiBuilder.append(asciiValue).append(" ");
            
            if (asciiValue + algorithmCalc <= 128) {
                asciiValue = asciiValue + algorithmCalc;
            } else {
                int exceededValue = asciiValue + algorithmCalc;
                asciiValue = exceededValue - 128;
            }
            
            String binaryString = Integer.toBinaryString(asciiValue);
            finalAsciiBuilder.append(asciiValue).append(" ");
            encodedField.append(binaryString).append(" ");
        }
        
        System.out.println("SASCII:\t" + startAsciiBuilder.toString());
        System.out.println("FASCII:\t" + finalAsciiBuilder.toString());
        
        return encodedField.toString();
    }
    
    private static int algorithm(int count) {
        return (int) ((double) Math.E * ((count - 8) * 6.5 / Math.PI));
    }

}