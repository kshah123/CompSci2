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
 * @author Kush Shah
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File a = new File("answ.txt");
        File r = new File("resp.txt");
        Scanner console = new Scanner(a);
        ArrayList<String> ans = new ArrayList();
        int total = 0;
        //getting correct answers
        while(console.hasNextLine()){
            ans.add(console.nextLine());
            total++;
        }
        console.close();
        console = new Scanner(r);
        ArrayList<ArrayList<String>> resp = new ArrayList();
        int x = 0;
        while(console.hasNextLine()){
            String i = console.nextLine();
            String[] t = i.split("/s");
            resp.get(x).add(t[0]); //0th element is student number
            resp.get(x).add(t[1]); //1st element are responses
            x++;
        }
        int c = 0;
        ArrayList<Integer> correct = new ArrayList();
        for(int i = 0; i < resp.size(); i++){
            char[] p = resp.get(i).get(1).toCharArray();
            for(int b = 0; b < ans.size(); b++){
                if(ans.get(b).charAt(0) == p[b])
                    c++;
            }
            correct.add(c);
            c = 0;
        }
        for(int i = 0; i < resp.size(); i++){
            double percent = ((double) (correct.get(i)))/ total;
            System.out.println("Student #" + resp.get(i).get(0) + " got a " + percent + "%");
        }
        console.close();
        console = new Scanner(System.in);
        System.out.println("Do you want to add any additional student info?");
        String yn = console.next();
        while(yn.equals("y")){
            System.out.println("Please enter the info as follows: student number, a space and then the responses with no spaces between them");
            String num = console.next();
            String answers = console.next();
            char ansList[] = answers.toCharArray();
            c = 0;
            for(int i = 0; i < ans.size(); i++){
                if(ans.get(i).equals(ansList[i]))
                    c++;
            }
            double percent = ((double)(c))/total;
            System.out.println("Student #" + num + "got a " + percent + "%");
            System.out.println("Do you want to add any additional info?");
            yn = console.nextLine();
        }
    }
    
}
