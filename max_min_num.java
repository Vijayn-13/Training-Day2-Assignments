import java.util.*;
public class max_min_num
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    System.out.print("Enter value: ");
		    arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++){
		    if(arr[i]>max){
		        max=arr[i];
		    }
		    if(arr[i]<min){
		        min=arr[i];
		    }
		}
		System.out.println("Maximum number: "+max);
		System.out.println("Minimum number: "+min);
	}
}