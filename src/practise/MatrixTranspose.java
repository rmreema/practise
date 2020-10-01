package practise;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 7,8,9 }, { 3,6,9 }, { 8,2,2 } };
		int n=3;
		int transpose[][] = new int [n][n];
	
				
		
		// int N = 3;
		// int R = 3;
		System.out.println("Before Modification");
		print(mat, n);
		modify(mat, transpose,n);
		System.out.println("After Modification");
		print(transpose, n);
	}

	public static void print(int mat[][], int N) {

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				System.out.print(mat[i][j] + " ");

			}
			System.out.println();
		}
	}

	

	public static void modify(int mat[][], int transpose[][],int N) {

		
		// modifying the matrix

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				 transpose[i][j] = mat[j][i] ;

			}

		}

	}
	
public static void m(int mat[][], int transpose[][],int N) {

		
		// modifying the matrix

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				 transpose[i][j] = mat[j][i] ;

			}

		}

	}
}
