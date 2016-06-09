/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pally;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class Pally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        char[] in = console.next().toCharArray();
        int c = in.length-1;
        boolean a = true;
        for(int i = 0; i < in.length/2; i++){
            if(in[i] != in[c]){
                a = false;
                break;
            }
            c--;
        }
        System.out.println(a);
    }
    
}
