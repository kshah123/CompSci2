/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcount;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class NumCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        char[] nums = "1234567890".toCharArray();
        char[] str = console.next().toCharArray();
        int counter = 0;
        int strCount = 0;
        for(int i = 0; i < str.length; i++){
            for(int a = 0; a < nums.length; a++){
                if(str[i] == nums[a]){
                    counter++;
                }
            }
        }
        System.out.println("There are " + counter + "numbers in the string");
        System.out.println("There are " + (str.length - counter) + "non-numbers");
    }
    
}
