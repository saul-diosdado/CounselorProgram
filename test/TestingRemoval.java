
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saul Diosdado
 */
public class TestingRemoval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList();
        ArrayList<Integer> listTwo = new ArrayList();
        
        listOne.add(0);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);
        
        listTwo.add(0);
        listTwo.add(2);
        listTwo.add(3);
        listTwo.add(3);
        listTwo.add(6);
        
        listOne.removeAll(listTwo);
        
        for (int i = 0; i < listOne.size(); i++) {
            System.out.println(listOne.get(i));
        }
    }
    
}
