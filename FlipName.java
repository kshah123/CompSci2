/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flipname;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class FlipName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        String first = console.next();
        String last = console.next();
        System.out.println(last + ", " + first);
    }
    
}
