/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicpoints;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 18shahk
 */
public class DynamicPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dynamicPoints a = new dynamicPoints();
        Scanner in = new Scanner(System.in);
        
        System.out.println("You are going to type in a verical line");
        System.out.println("Type in the x value for your vertical line");
        double x = in.nextDouble();
        
        System.out.println("Type in the lowest y value for your vertical line");
        double y1= in.nextDouble(); 
        
        System.out.println("Type in the highest y value for the verical line"); 
        double y2 = in.nextDouble();
        
        a.setX(x);
        a.setY1(y1);
        a.setY2(y2);
        
        a.setSlope();
        double slope = a.getSlope();
        
        System.out.println("The randomly generated slope from the origin is: " + slope);
        
        boolean pass = a.checkSlope();
        if(pass = true){
            System.out.println("The slope passes through your line segment");
        }
        else{
            System.out.println("The slope does not pass through your line");
        }
        
    }
    public static class dynamicPoints{
        private double x;
        private double y1;
        private double y2;
        private int deltaX;
        private int deltaY;
        private double slope;
    
        public dynamicPoints(){
            x = 0;
            y1=0;
            y2 = 0;
            deltaX = 0;
            deltaY = 0;
            slope = 0;
        }
        
        public void setX(double l){
            x= l;
        }
        public double getX(){
            return x;
        }
        public void setY1(double m){
            y1= m;
        }
        public double getY1(){
            return y1;
        }
        public void setY2(double n){
            y2 = n;
        }
        public double setY2(){
            return y2;
        }
        public void setSlope(){
            Random rm = new Random();
            deltaX = rm.nextInt(200)-100;
            deltaY = rm.nextInt(200)-100;
            double slope = deltaY/deltaX;
            while(slope > (2/3) && slope < (-2/3)){
                deltaX = rm.nextInt(200)-100;
                deltaY = rm.nextInt(200)-100;
                slope = deltaY/deltaX;
            }    
        }
        public double getSlope(){
            return slope;
        }
        public boolean checkSlope(){
            boolean intersect = false;
            double f = slope * x;
            if(f >= y1 && f <= y2){
                intersect = true;
            }
            return intersect;
        }
    }
}
