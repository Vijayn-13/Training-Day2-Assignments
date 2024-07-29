import java.util.*;
public class fibonacci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n to set the limit: ");
		int n=sc.nextInt();
		int a=0,b=1,c;
		if(n>=1){
		    System.out.println("Fibonacci series:-");
		    System.out.print(a+" ");
		    if(n>=2){
		        System.out.print(b+" ");
		    }
		}
		for(int i=2;i<n;i++){
		    c=a+b;
		    a=b;
		    b=c;
		    System.out.print(c+" ");
		}
	}
}