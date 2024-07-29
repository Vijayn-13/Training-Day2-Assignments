import java.util.*;
public class coupon_number
{
	static int distinct_coupon(int n,int r,List<Integer> ls){
	    int c=0,a=0;
	    while(c!=n){
	        int b=random_number(r);
	        if(!ls.contains(b)){
	            ls.add(b);
	            c++;
	        }
	        a++;
	    }
	    return a;
	}
	static int random_number(int r){
	    Random rand=new Random();
	    return rand.nextInt(r);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of coupons to print: ");
		int n=sc.nextInt();
		System.out.print("Enter range: ");
		int r=sc.nextInt();
		List<Integer> ls=new ArrayList<>();
		int m=distinct_coupon(n,r,ls);
		System.out.println(ls);
		System.out.println("Total number of random numbers needed to print "+n+" distinct coupon numbers is "+m);
	}
}