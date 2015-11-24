/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author 18shahk
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        double n = in.nextDouble();
        
        double root = Math.sqrt(n);
        System.out.println("The sqaure root of your number is " + root);
        
        System.out.println("What power do you want to raise your number to?");
        double power = in.nextDouble();
        double ex = Math.pow(n,power);
        System.out.println(n + " raised to the " + power + " power is " + ex);
        
        double ab = Math.abs(n);
        System.out.println("The absolute value of your number is " + ab);
        
        boolean isEven = false;
        if(n%2 == 0){
            isEven = true;
        }
        else{
            isEven = false;
        }
        System.out.println(isEven);
        
        if(isEven != true){
            System.out.println("Your number is odd");
        }
        else if(isEven != false){
            System.out.println("Your number is even");
        }
        double squared = n * n;
        System.out.println("Your number squared is " + squared);
        
        
        System.out.println("How many doubles do u wanna enter");
        int numDoub = in2.nextInt();
        double[] listDoub = new double[numDoub];
        for(int i = 0; i < numDoub; i++){
            System.out.println("Type in the value of value number " + (i+1));
            double x = in.nextDouble();
            listDoub[i] = x;
        }
        double sum = 0;
        for(int w = 0; w < numDoub; w++){
            sum = listDoub[w] + sum;
    }
        System.out.println("The sum of your numbers is: " + sum);
        
        double product = 1;
        for(int x = 0; x < numDoub; x++){
            product = listDoub[x] * sum;
    }
        System.out.println("The product of your numbers is: " + product);
       
        double diff  = 0;
        for(int y = 0; y < numDoub; y++){
            diff = diff - listDoub[y];
    }
        System.out.println("The difference of your numbers is: " + diff);
        
        double quot = 1;
        for(int z = 0; z < numDoub; z++){
            quot = quot / listDoub[z];
    }
        System.out.println("The quotient of your numbers is:" + quot);
    }
}



