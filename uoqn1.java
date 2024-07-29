import java.util.*;
public class uoqn1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		System.out.println("Post increment of "+a+" is "+(a++));
		System.out.println("Pre increment of "+a+" is "+(++a));
	}
}