package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CountPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3));
		int k = 1;
	System.out.println(countPairs(numbers,1));
	}
	
	public static int countPairs(List<Integer> numbers, int k) {
		// Write your code here
		if (k < 0) {
		return 0;
		}
		Collections.sort(numbers);
		int counter = 0;
		int left = 0;
		int right = 0;
		HashSet<Integer> set = new HashSet<>();
		while (right < numbers.size()) {
		int s = numbers.get(right) - numbers.get(left);
		if (s == k && left != right && !set.contains(numbers.get(right)))
		{
		counter++;
		set.add(numbers.get(right));
		left++;
		right++;
		} else if (s > k) {
		left++;
		} else {
		right++;
		}
		}
		return counter;
		}
		}



