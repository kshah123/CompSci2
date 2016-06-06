/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revstring;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class RevString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        char[] str = console.next().toCharArray();
        for(int i = str.length - 1; i >= 0 ; i--)
            System.out.print(str[i]);
    }
    
}
