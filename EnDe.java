/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ende;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class EnDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        char[] str = console.next().toCharArray();
        char in = console.next().charAt(0);
        if(in == 'e'){
            System.out.println("You're new string is ");
            for(int i = 0; i < str.length; i++){
                str[i] -= (int)(42.0);
                str[i] += (int)(.69 * i);
                System.out.print(str[i]);
            }
        }
        else{
            System.out.println("That decodes to");
            for(int i = 0; i < str.length; i++){
                str[i] += (int)(42.0);
                str[i] -= (int)(.69 * i);
                System.out.print(str[i]);
            }
        }
    }
    
}
