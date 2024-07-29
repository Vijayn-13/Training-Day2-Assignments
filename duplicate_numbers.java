import java.util.*;
public class duplicate_numbers
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
		System.out.println("Duplicate elements:-");
		if(arr[0]==0){
		    for(int i=1;i<n;i++){
	            if(arr[i]==arr[0]){
		            System.out.println(arr[0]);
		            break;
	            }
    		}
		}
		else{
		    int a;
		    for(int i=0;i<n;i++){
    		    a=0;
    		    if(arr[i]!=0){
    		        for(int j=i+1;j<n;j++){
    		            if(arr[i]==arr[j]){
        		            a=1;
        		            arr[j]=0;
    		            }
        		    }
        		    if(a==1){
        		        System.out.println(arr[i]);
        		    }
    		    }
    		}
		}
	}
}