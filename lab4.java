/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author installer
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("You have a circle, what's its radius?");
        double radius = in.nextDouble();
        
        double diameter = getDiameter(radius);
        double circumference = getCircumference(diameter);
        double area = getArea(radius);
        
        System.out.println("The radius of your circle is " + radius);
        System.out.println("The diameter of your circle is " + diameter);
        System.out.println("The circumference of your cirlce is " + circumference);
        System.out.println("The area of your circle is " + area);
    }
    public static double getDiameter(double r){
        double d = 2 * r;
        return d;
    }
    public static double getCircumference(double d){
        double c = d * Math.PI;
        return c;
    }
    public static double getArea(double r){
        double a = Math.PI * Math.pow(r, 2);
        return a;
    }
    
}
