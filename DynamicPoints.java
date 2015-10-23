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
        dyanmicPoints b = new dynamicPoints();
        Scanner in = new Scanner(System.in);
        Random rm = new Random();
        
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        a.setX(x1);
        a.setY(y1);
        
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        b.setX(x2);
        b.setY(y2);
    }
    public static class dynamicPoints{
        private double x;
        private double y;
        private int deltaX;
        private int deltaY;
    
        public dynamicPoints(){
            x = 0;
            y = 0;
            deltaX = 0;
            deltaY = 0;
            slope = 0;
        }
        
        public void setX(double m){
            m = x;
        }
        public double getX(){
            return x;
        }
        public void setY(double n){
            n = y;
        }
        public double setY(){
            return y;
        }
        public void setSlope(){
            rm.nextInt(100)-100 = deltaX;
            rm.nextInt(100)-100 = deltaY;
            double slope = deltaY/deltaX;
            while(slope > (2/3) && slope < (-2/3)){
                rm.nextInt(100)-100 = deltaX;
                rm.nextInt(100)-100 = deltaY;
                slope = deltaY/deltaX;
            }    
        }
        public double getSlope(){
            return slope;
        }
        
    }
}
