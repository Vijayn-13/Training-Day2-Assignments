import java.util.*;
public class longest_substring
{
    public static int repeat(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        // System.out.println(s);
        // System.out.println(new String(ch));
        for(int i=1;i<s.length();i++){
            if(ch[i]==ch[i-1]){
                // System.out.println("-");
                return 0;
            }
        }
        return 1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();
		int n=str.length();
		int a=0,c;
		String st=new String();
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<=n;j++){
		        c=repeat(str.substring(i,j));
		        if(c==1){
		          //  System.out.println("*");
		            if(a<(j-i+1)){
		                st=str.substring(i,j);
		                a=st.length();
		            }
		        }
		    }
		}
		System.out.println("Length of Longest substring without repeating characters: "+a+"\nLongest Substring: "+st);
	}
}