import java.util.*;
public class loqn2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		if((a%5==0) && (a%7==0)){
		    System.out.println(a+" is divisible by both 5 and 7");
		}
		else{
		    System.out.println(a+" is not divisible by both 5 and 7");
		}
	}
}