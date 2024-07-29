import java.util.*;
public class matrix_multiplication
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter r1: ");
		int r1=sc.nextInt();
		System.out.print("Enter c1: ");
		int c1=sc.nextInt();
		System.out.print("Enter r2: ");
		int r2=sc.nextInt();
		System.out.print("Enter c2: ");
		int c2=sc.nextInt();
		if(c1!=r2){
		    System.out.println("Matrix multiplication is not possible if the number of columns in matrix 1 and number of rows in matrix 2 are not same");
		}
		else{
		    int[][] arr1=new int[r1][c1];
    		int[][] arr2=new int[r2][c2];
    		for(int i=0;i<r1;i++){
    		    for(int j=0;j<c1;j++){
    		        System.out.print("Enter values of array 1: ");
    		        arr1[i][j]=sc.nextInt();
    		    }
    		}
    		for(int i=0;i<r2;i++){
    		    for(int j=0;j<c2;j++){
    		        System.out.print("Enter values of array 2: ");
    		        arr2[i][j]=sc.nextInt();
    		    }
    		}
    		System.out.println("Matrix 1:-");
    		for(int i=0;i<r1;i++){
    		    for(int j=0;j<c1;j++){
    		        System.out.print(arr1[i][j]+" ");
    		    }
    		    System.out.println();
    		}
    		System.out.println("Matrix 2:-");
    		for(int i=0;i<r2;i++){
    		    for(int j=0;j<c2;j++){
    		        System.out.print(arr2[i][j]+" ");
    		    }
    		    System.out.println();
    		}
    		System.out.println("Matrix Multiplication:-");
    		int[][] mat=new int[r1][c2];
    		for(int i=0;i<r1;i++){
    		    for(int j=0;j<c2;j++){
    		        for(int k=0;k<c1;k++){
    		            mat[i][j]+=arr1[i][k]*arr2[k][j];
    		        }
    		    }
    		}
    		for(int i=0;i<r1;i++){
    		    for(int j=0;j<c2;j++){
    		        System.out.print(mat[i][j]+" ");
    		    }
    		    System.out.println();
    		}
		}
	}
}