import java.util.*;
public class boqn2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		System.out.println(a+"*2 using "+a+"<<1 is "+(a<<1));
		System.out.println(a+"/2 using "+a+"<<1 is "+(a>>1));
	}
}