package practise;

import java.util.Scanner;

public class DescSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, temp;
		System.out.println("Enter the number of elements in an array");
		n = s.nextInt();
		System.out.println("Enter the elements of an array");
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		for (int i = 0; i < n; i++) {

			for (int j = i+1; j < n; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+ "");
		}

	}

}
