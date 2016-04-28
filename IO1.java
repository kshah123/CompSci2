/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readnames;
import java.util.*;
import java.io.*;
/**
 *
 * @author installer
 */
public class ReadNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File f1 = new File("fileone.txt");
        File f2 = new File("filetwo.txt");
        Scanner sc1 = new Scanner(f1);
        Scanner sc2 = new Scanner(f2);
        ArrayList<String> l1 = new ArrayList();
        ArrayList<String> l2 = new ArrayList();
        while(sc1.hasNextLine())
            l1.add(sc1.nextLine());
        sc1.close();
        while(sc2.hasNextLine())
            l2.add(sc2.nextLine());
        sc2.close();
        for(int i = 0; i < l1.size(); i++){
            for(int a = 0; a < l2.size(); a++){
                if(l2.get(a).equals(l1.get(i)))
                    l2.remove(a);
            }
        }
        l1.addAll(l2);
        File out = new File("mergedfile.txt");
        PrintWriter pw = new PrintWriter(out);
        for(int i = 0; i < l1.size(); i++)
            pw.println(l1.get(i));
        pw.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the unique names? (y or n)");
        char a = sc.next().charAt(0);
        if(a == 'y')
            for(int i = 0; i < l1.size(); i++)
                System.out.println(l1.get(i));
        
    }
    
}
