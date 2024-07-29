import java.util.*;
public class perfect_number
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=(n/2);i++){
		    if(n%i==0){
		        if(sum==0){
		            System.out.print("Divisors of "+n+": ");
		        }
		        System.out.print(i+" ");
		        sum+=i;
		    }
		}
		System.out.println();
		if(sum==n){
		    System.out.println("Perfect number");
		}
		else{
		    System.out.println("Not a Perfect number");
		}
	}
}