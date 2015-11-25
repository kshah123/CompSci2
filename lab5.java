/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Type in an operation, pres space between the numbers and operation.");
        String operation = in.next();
        String[] parts = operation.split(" ");
        
        double num1 = Double.parseDouble(parts[1]);
        double num2 = Double.parseDouble(parts[3]);
        String symbol = parts[2];
        double answer = 0;
        if(symbol.equals("+")){
            answer = add(num1, num2);
        }
        else if(symbol.equals("-")){
            answer = subtract(num1, num2);
        }
        else if(symbol.equals("*")){
            answer = multiply(num1, num2);
        }
        else if(symbol.equals("/")){
            answer = divide(num1, num2);
        }
    }
    public static double add(double x, double y){
        double z = x + y;
        return z;
    }
    public static double subtract(double x, double y){
        double z = x - y;
        return z;
    }
    public static double multiply(double x, double y){
        double z = x * y;
        return z;
    }
    public static double divide(double x, double y){
        double z = x / y;
        return z;
    }
}
