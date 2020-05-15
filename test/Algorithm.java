
/**
 *
 * @author Saul Diosdado
 */
public class Algorithm {

    public static void main(String[] args) {
        System.out.println(algorithm(19));
    }
    
    private static int algorithm(int count) {
        count = count * (count / 3) - 10;
        count *= 2;
        count = (int) ((double) count / Math.PI);
        return count;
    }
    
}
