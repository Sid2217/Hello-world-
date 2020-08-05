import java.util.Scanner;

public class matrix 
{	
	Scanner s = new Scanner(System.in);
	void setdata(int m,int n,int[][] A,int[][] B)
	{	
		int i,j;
		System.out.print("Enter 1st Matrix \n");
 		for (i = 0; i < m; i++) 
 		{ 	
 			for (j = 0; j < n; j++)
 			{
 				System.out.print("[" + i + "]" + "[" + j + "]" + ":"); 
 				A[i][j] = s.nextInt();
 			}
 		}
 		System.out.print("Enter 2nd Matrix \n");
 		for (i = 0; i < m; i++) 
 		{ 	
 			for (j = 0; j < n; j++)
 			{
 				System.out.print("[" + i + "]" + "[" + j + "]" + ":"); 
				B[i][j] = s.nextInt();
 			}
 		}
	}
	    static int[][] add(int A[][], int B[][], int C[][],int m , int n) 
	    { 
	        int i, j; 
	        for (i = 0; i < m; i++) 
	            for (j = 0; j < n; j++) 
	                C[i][j] = A[i][j] + B[i][j]; 
	        return C;
	    } 
	public static void main(String[] args)
	{
		int i, j; 
		matrix mn = new matrix();
		Scanner s = new Scanner(System.in);
		System.out.println("How Many Rows : ");
		int m = s.nextInt();
		System.out.println("How Many Columns : ");
		int n = s.nextInt();
		int A[][] = new int[m][n]; 
		int B[][] = new int[m][n];
 		int C[][] = new int[m][n];  
 		mn.setdata(m, n, A, B);
 		C = add(A, B, C,m,n); 
 		System.out.print("Result matrix is \n");
 		for (i = 0; i < m; i++) 
 		{ 	
 			for (j = 0; j < n; j++) 
 				System.out.print(C[i][j] + " "); 
 			System.out.print("\n"); 
 		} 
	} 

}




