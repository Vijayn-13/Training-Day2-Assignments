import java.util.*;
public class toqn2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks out of 100: ");
		int a=sc.nextInt();
		System.out.println((a>=50)?"Student PASSED the exam":"Student FAILED the exam");
	}
}