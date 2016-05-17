/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringex2;
import java.util.Scanner;
/**
 *
 * @author Kush Shah
 */
public class StringEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Type in a password that is between 8 and 20 characters, has at least 1 upper and 1 lower case character, has a number, but cannot start with a number");
        String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String low = up.toLowerCase();
        String num = "12345678990";
        char[] upper = up.toCharArray();
        char[] lower = low.toCharArray();
        char[] number = num.toCharArray();
        boolean condition = false;
        String initial = new String();
        while(condition == false){
            initial = console.next();
            condition = true;
            
            //checking if uppercase letters are present
            for(int i = 0; i < upper.length; i++){
                if(initial.indexOf(upper[i]) != -1){
                    condition = true;
                    break;
                }
                else
                    condition = false;
            }
            //checking if lowercase letters are present
            for(int i = 0; i < lower.length; i++){
                if(initial.indexOf(lower[i]) != -1){
                    condition = true;
                    break;
                }
                else
                    condition = false;
            }
            //checking if numbers are present
            for(int i = 0; i < number.length; i++){
                if(initial.indexOf(number[i]) != -1){
                    condition = true;
                    break;
                }
                else
                    condition = false;
            }
            for(int i = 0; i < number.length; i++){
                if(initial.indexOf(number[i]) == 0){
                    condition = false;
                    break;
                }
            }
            //checking length
            int u = initial.length();
            if(u > 20 || u < 8){
                condition = false;
            }
            if(condition == false)
                System.out.println("That is not a valid password, please try again");
        }
        String conf;
        do{
            System.out.println("Pleast type in your password again for confirmation");
            conf = console.next();
            if(!(conf.equals(initial)))
                System.out.println("The passwords did not match up, please try again");
        }while(!(conf.equals(initial)));
        System.out.println("Thank you, your password has been recorded");
    }
    
}
