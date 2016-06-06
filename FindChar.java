/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findchar;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class FindChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        char[] str = console.next().toCharArray();
        char find = console.next().charAt(0);
        int counter = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == find)
                counter++;
        }
        System.out.println("There are " + counter + " times that that character is in the string");
    }
    
}
