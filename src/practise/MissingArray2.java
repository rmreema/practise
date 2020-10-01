package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5, 6, 7, 8, 9));
		int N = 9;
		int miss = findMissing(list, N);
		System.out.println(miss);
	}

	public static int findMissing(List list, int N) {

		int total= (N + 1) * (N + 2) / 2;
		for(int i=0;i<N;i++) 
			total = total - (int) list.get(i);
	        return total;
					
		
	}
}
