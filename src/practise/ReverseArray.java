package practise;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, temp = 0;
		System.out.println("Enter the number of elements in an array");
		n = s.nextInt();
		int[] rev = new int[n];
		int[] arr = new int[n];
		System.out.println("Enter the elements of array");

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();

		}
		// Reversing the array
		int j=n;
		for (int i = 0; i < n; i++) {
			rev[i] = arr[j-1];
			 j=j-1;
			
			
		}
		System.out.println("The Array");
		for (int i = 0; i < n; i++) {
			System.out.print(rev[i] + " ");

		}

	}

}
