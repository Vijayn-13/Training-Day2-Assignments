import java.util.*;
public class boqn3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int a=sc.nextInt();
		if((a&1)==0){
		    System.out.println(a+" is even number");
		}
		else{
		    System.out.println(a+" is odd number");
		}
	}
}