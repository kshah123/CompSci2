/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regionmatchprac;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class RegionMatchPrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Type in 2 strings, click enter after typing each one");
        String s1 = console.next();
        String s2 = console.next();
        System.out.println("For the first string, from which value (0 to " + (s1.length()-1) + ") you want to check. It first element will be inclusive, the last element will be exclusive");
        String[] t = console.next().split(",");
        int r1 = Integer.parseInt(t[0]);
        int r2 = Integer.parseInt(t[1]);
        char[] str1 = s1.substring(r1,r2).toCharArray();
        System.out.println("For the second string, from which value (0 to " + (s1.length()-1) + ") you want to check. It first element will be inclusive, the last element will be exclusive");
        String[] t1 = console.next().split(",");
        r1 = Integer.parseInt(t1[0]);
        r2 = Integer.parseInt(t1[1]);
        char[] str2 = s1.substring(r1,r2).toCharArray();
        boolean match = rMatch(str1, str2);
        System.out.println(match);
        
    }
    public static boolean rMatch(char[] s1, char[] s2){
        if(s1.length != s2.length)
            return false;
        for(int i = 0; i < s1.length; i++){
            if(s1[i] >= 97)
                s1[i]-= 32;
        }
        for(int i = 0; i < s2.length; i++){
            if(s2[i] >= 97)
                s2[i]-= 32;
        }
        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s2[2])
                return false;
        }
        return true;
    }
    
}
