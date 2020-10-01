package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9,10));
		int N = 9;
		findMissing(list, N);
	}

	public static void findMissing(List list, int N) {

		for (int i = 0; i < N-1; i++) {

			int first = (int) list.get(i);
			int second = (int) list.get(i + 1);
			if (!(first == second - 1)) {
				int missing = first+1;
				System.out.println("The Missing Number is " + missing);
			}
			else {
			int last = (int) list.get(N-1)+1;
			System.out.println("The Missing number is" + last );
			break;}
		}

	}

}
