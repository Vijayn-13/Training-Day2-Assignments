import java.util.*;
public class arr_reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int a;
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    System.out.print("Enter value: ");
		    arr[i]=sc.nextInt();
		}
		System.out.println("Before Array reversal:-");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Array reversal:-");
		for(int i=0;i<n/2;i++){
		    a=arr[i];
		    arr[i]=arr[n-i-1];
		    arr[n-i-1]=a;
		}
		System.out.println(Arrays.toString(arr));
	}
}