import java.util.*;
public class freq_string_char
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();
		System.out.println("Frequency of elements:-");
		int a;
		for(int i=0;i<str.length();i++){
		    a=1;
		    if(str.charAt(i)!='$'){
		        for(int j=i+1;j<str.length();j++){
		            if(str.charAt(i)==str.charAt(j)){
    		            a++;
    		            str=str.substring(0,j)+'$'+str.substring(j+1);
		            }
    		    }
    		    System.out.println(str.charAt(i)+":"+a);
		    }
		}
	}
}