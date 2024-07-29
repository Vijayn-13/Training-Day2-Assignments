import java.util.*;
public class reverse_number
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int r=0,a=0;
		while(n!=0){
		    r=n%10;
		    a=a*10+r;
		    n=n/10;
		}
		System.out.println("Reversed number: "+a);
	}
}