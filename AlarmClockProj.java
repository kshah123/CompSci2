/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclockproj;

/**
 *
 * @author vikas
 */
import java.util.Scanner;
public class AlarmClockProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        alarmClock a = new alarmClock();

        //System.out.println(a.toString());
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        
        int hour = sc.nextInt();
        a.hour = hour;
        
        int min = sc.nextInt();
        a.setMin(min);
        
        int sec = sc.nextInt();
        a.setSec(sec);
        
        boolean mil = sn.nextBoolean();
        a.setMilitary(mil);
        
        int military = a.getMilitary();
        int y = a.getMin();
        int z = a.getSec();
        
        System.out.println(a.toString());
        
    }
    public static class alarmClock{
        private int hour;
        private int minute;
        private int second ;
        private boolean isMilitary;
        
        public alarmClock(){
        hour = 0;
        minute = 0;
        second = 0;
        isMilitary = false;
        }
        public void setMin(int m){
            minute = m;
        }
        public int getMin(){
            return minute;
        }
        public void setSec(int s){
            second = s;
        }
        public int getSec(){
            return second;
        }
        public void setMilitary(boolean k){
            isMilitary = k;
        }
        public int getMilitary(){
            Scanner sa = new Scanner(System.in);
            if(isMilitary == true){
                System.out.println("AM or PM?");
                String AMPM = sa.next();
                if(AMPM.equals("PM") || AMPM.equals("pm") || AMPM.equals("Pm")){
                    hour = hour + 12;
                }
            }
            return hour;
        }
        public String toString(){
            return (hour + ":" + minute + ":" + second);
        }
    }
}
