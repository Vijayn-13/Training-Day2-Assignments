import java.util.*;
public class anagram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter string1: ");
	    String str1=sc.nextLine();
	    System.out.print("Enter string2: ");
	    String str2=sc.nextLine();
	    char[] ch1=str1.toCharArray();
	    char[] ch2=str2.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    str1=new String(ch1);
	    str2=new String(ch2);
	    if(str1.equals(str2)){
	        System.out.println("Both are Anagrams");
	    }
	    else{
	        System.out.println("Both are not Anagrams");
	    }
	}
}