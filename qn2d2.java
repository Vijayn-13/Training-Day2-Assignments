import java.util.*;
public class qn2d2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		System.out.print("Enter limit size: ");
		int b=sc.nextInt();
		System.out.println("Multiplication table of "+a+" upto the limit size "+b+":-");
		for(int i=1;i<=b;i++){
		    System.out.println(i+"*"+a+"="+(i*a));
		}
	}
}