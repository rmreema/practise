package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersectionOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a","b","c"));
      ArrayList<String> list2 = new ArrayList<>(Arrays.asList("c","d","e"));
      union(list1, list2);
      Intersection(list1, list2);
      in(8);
	}

	public static void union(List<String> list1, List<String> list2) {
		//list1.addAll(list2);
		Set <String> set1 = new HashSet<>();
		set1.addAll(list1);
		set1.addAll(list2);
		 ArrayList<String> list3 = new ArrayList<>();
		 list3.addAll(set1);
		
		System.out.println("Union"+list3);
	}
	public static void Intersection(List<String> list1, List<String> list2) {
		//list1.addAll(list2);
		list1.retainAll(list2);
		
		System.out.println("Intersection"+list1);
	}
	
	public static void in(int i) {
		int j =i++;
		int k = ++i;
		System.out.println("j"+ j);
		System.out.println("k"+ k);
		String s = "Krisha";
		System.out.println(s.length());
	}
}
