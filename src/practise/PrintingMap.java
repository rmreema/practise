package practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PrintingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String> map = new HashMap <>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of Keys in the Map");
		int N = s.nextInt();
		System.out.println("Enter the key and value");
		for(int i=0;i<N; i++) {
			map.put(s.nextInt(),s.next());
		}
		
		System.out.println(map);
		//Iterator it = map.entrySet().iterator();
		
	}

	
}
