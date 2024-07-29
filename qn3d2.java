import java.util.*;
public class qn3d2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float sum=0;
		for(int i=0;i<5;i++){
		    System.out.print("Enter number: ");
		    sum+=sc.nextInt();
		}
		System.out.println("Average: "+(sum/5));
	}
}