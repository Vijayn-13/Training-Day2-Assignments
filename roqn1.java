import java.util.*;
public class roqn1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		System.out.print("Enter number2: ");
		int b=sc.nextInt();
		System.out.print("Enter number3: ");
		int c=sc.nextInt();
		if(a>b && a>c){
		    System.out.println(a+" is the biggest number");
		}
		else if(b>a && b>c){
		    System.out.println(b+" is the biggest number");
		}
		else{
		    System.out.println(c+" is the biggest number");
		}
	}
}