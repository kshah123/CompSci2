/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readnum;
import java.util.*;
import java.io.*;
/**
 *
 * @author installer
 */
public class ReadNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("fnum1.txt");
        Scanner console = new Scanner(file);
        Scanner counter = new Scanner(file);
        int i = 0;
        
        while(counter.hasNextLine()){
            i++;
            counter.nextLine();
        }
        
        counter.close();
        
        ArrayList<Integer> t = new ArrayList();
        for(int a = 0; a < i; a++){
            t.add(console.nextInt());
        }
        for(int a = 0; a < t.size(); a++){
            System.out.println(t.get(a));
        }
        Collections.sort(t);
        System.out.println("The biggest number is " + t.get(t.size() - 1));
        int sum = 0;
        for(int a = 0; a < t.size(); a++){
            sum+= t.get(a);
        }
        System.out.println(sum);
        if(sum > 32767)
            System.out.println("The sum is greater than 32,767");
        else
            System.out.println("The sum is less than 32,767");
        
        System.out.println("There are " + t.size() + " numbers in the file");
    }
    
}
