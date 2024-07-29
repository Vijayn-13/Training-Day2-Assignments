import java.util.*;
public class qn1d2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		System.out.print("Enter number2: ");
		int b=sc.nextInt();
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		System.out.println("Difference between "+a+" and "+b+" is "+Math.abs(a-b));
	}
}