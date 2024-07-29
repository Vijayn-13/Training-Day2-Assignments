import java.util.*;
public class freq_num
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
		System.out.println("Frequency of elements:-");
		int a=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==0){
		        a++;
		    }
		}
		System.out.println("Occurences of 0 is "+a);
		for(int i=0;i<n;i++){
		    a=1;
		    if(arr[i]!=0){
		        for(int j=i+1;j<n;j++){
		            if(arr[i]==arr[j]){
    		            a++;
    		            arr[j]=0;
		            }
    		    }
    		    System.out.println("Occurences of "+arr[i]+" is "+a);
		    }
		}
	}
}