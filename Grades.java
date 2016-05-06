/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;
import java.util.*;
import java.io.*;
/**
 *
 * @author installer
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File a = new File("ans.txt");
        File r = new File("rpns.txt");
        Scanner console = new Scanner(a);
        ArrayList <String> ans = new ArrayList();
        int t = 0;
        while(console.hasNextLine()){
            ans.add(console.nextLine());
            t++;
        }
        console.close();
        console = new Scanner(r);
        ArrayList<String> resp = new ArrayList();
        while(console.hasNextLine())
            resp.add(console.nextLine());
        int s = 0;
        ArrayList<Integer> wrong = new ArrayList();
        for(int i = 0; i < ans.size(); i++){
            if(ans.get(i).equals(resp.get(i)))
                s++;
            else
                wrong.add(i);
        }
        double percent = ((double)(s))/t;
        System.out.println("You got a " + percent + "%");
        String wr = "Numbers ";
        for(int i = 0; i < wrong.size(); i++){
            if(i == wrong.size() - 1)
                wr += wrong.get(i) + " ";
            else
                wr += wrong.get(i) + ", ";
        }
        wr += "wrong.";
        
    }
    
}
