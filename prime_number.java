import java.util.*;
public class prime_number
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int a=0;
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        a=1;
		        break;
		    }
		}
		if(a==1){
		    System.out.println("Not a Prime number");
		}
		else{
		    System.out.println("Prime number");
		}
	}
}