/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringex1;
import java.util.*;
import java.io.*;
/**
 *
 * @author Kush Shah
 */
public class StringEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File f = new File("words.txt");
        Scanner console = new Scanner(f);
        int i = 1;
        int th = 0;
        int ed = 0;
        ArrayList<String> words = new ArrayList();
        while(console.hasNextLine()){
            String a = console.nextLine();
            if(i%5 == 0)
                a.toUpperCase();
            else
                a.toLowerCase();
            a.replaceAll("a", "*");
            a.replaceAll("e", "*");
            a.replaceAll("i", "*");
            a.replaceAll("o", "*");
            a.replaceAll("u", "*");
            if(a.startsWith("th"))
                th++;
            if(a.endsWith("ed"))
                ed++;
            words.add(a);
            i++;
        }
        System.out.println("First set of 20:");
        int x;
        int t = 20;
        for(int a = 0; a < 100; a++){
            System.out.println(words.get(a));
            if((a+1) % 20 == 0 && a != 99)
                System.out.println("Next set of 20:");
        }
        System.out.println("There were " + th + " words that started with 'th'");
        System.out.println("There were " + ed + " words that ended with 'ed'");
    }
    
}
