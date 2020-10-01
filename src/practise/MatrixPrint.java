package practise;

public class MatrixPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 } };
		// int N = 3;
		// int R = 3;
		System.out.println("Before Modification");
		print(mat, 4, 4);
		modify(mat, 4, 4);
		System.out.println("After Modification");
		print(mat, 4, 4);
	}

	public static void print(int mat[][], int N, int R) {

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < R; j++) {

				System.out.print(mat[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void modify(int mat[][], int N, int R) {

		int[] n = new int[N];
		int[] r = new int[R];

		// constructing the temp arrays
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < R; j++) {

				if (mat[i][j] == 1) {
					r[i] = 1;
					n[i] = 1;
				}

			}

		}

		// modifying the matrix

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < R; j++) {

				if (r[i] == 1 || n[j] == 1) {
					mat[i][j] = 1;
				}

			}

		}

	}
}
