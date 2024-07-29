import java.util.*;
public class stopwatch{
    static int elapsed_time(int n){
        Calendar cd=Calendar.getInstance();
        int a=cd.get(Calendar.HOUR);
        int b=cd.get(Calendar.MINUTE);
        int c=cd.get(Calendar.SECOND);
        if(n==1){
            System.out.println("Started time in GMT: "+a+"hr "+b+"m "+c+"s");
        }
        else{
            System.out.println("Stoped time in GMT: "+a+"hr "+b+"m "+c+"s");
        }
        int hr=a*60;
        int min=hr+(b*60);
        int sec=min+c;
        return sec;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 to start the clock: ");
        int n;
        n=sc.nextInt();
        System.out.println("Started....");
        int s1=elapsed_time(n);
        System.out.print("Enter 0 to stop the clock: ");
        n=sc.nextInt();
        System.out.println("Stoped....");
        int s2=elapsed_time(n);
        int diff=Math.abs(s2-s1);
        System.out.println("Elapsed Time: "+diff);
    }
}