import java.util.*;
public class boqn1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		System.out.print("Enter number2: ");
		int b=sc.nextInt();
		System.out.println(a+"&"+b+"="+(a&b));
		System.out.println(a+"|"+b+"="+(a|b));
		System.out.println(a+"^"+b+"="+(a^b));
	}
}