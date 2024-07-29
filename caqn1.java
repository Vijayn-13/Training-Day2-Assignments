import java.util.*;
public class caqn1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		System.out.println(a+"+=5 is "+(a+=5));
		System.out.println(a+"-=5 is "+(a-=5));
		System.out.println(a+"*=5 is "+(a*=5));
		System.out.println(a+"/=5 is "+(a/=5));
		System.out.println(a+"%=5 is "+(a%=5));
	}
}