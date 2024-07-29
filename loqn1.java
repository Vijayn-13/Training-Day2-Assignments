import java.util.*;
public class loqn1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year: ");
		int a=sc.nextInt();
		if((a%4==0) && ((a%100==0 && a%400==0) || (a%100!=0 && a%400!=0))){
		    System.out.println(a+" is Leap year");
		}
		else{
		    System.out.println(a+" is not a Leap year");
		}
	}
}