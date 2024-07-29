import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter string: ");
	    String str1=sc.nextLine();
	    StringBuffer st=new StringBuffer(str1);
	    st.reverse();
	    String str2=String.valueOf(st);
	    if(str1.equals(str2)){
	        System.out.println("Palindrome");
	    }
	    else{
	        System.out.println("Not Palindrome");
	    }
	}
}