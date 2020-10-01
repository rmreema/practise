package test;

import java.util.Arrays;
import java.util.Comparator;

public class WebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] item = {{"p1","1","2"},{"p2","2","1"}};
		//int [][] item = {{1,2,3},{3,2,1}};
		System.out.println(fetchItemsToDisplay(item,1,0,1,1));
		 
    } 

	

	public static String fetchItemsToDisplay(String [][] items, int sortParameter,
			int sortOrder, int itemPerPage, int pageNumber) {
		
		Arrays.sort(items, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				String[] row1 = (String[]) o1;
				String[] row2 = (String[]) o1;
				return row1[sortParameter].compareTo(row2[sortParameter]);
			}
			
		});

		for (int i=0; i<items.length; i++) {
			String [] row = items[i];
			for (int j=0; j<items.length; j++)
			{
				System.out.println(row[j]+"");
			}
			System.out.println("\n");
		}
		
		return null;
	}
}

class ColumnComparator implements Comparator {

	int columnToSort;
	int sort;
	
	public ColumnComparator(int columnToSort , int sort) {
		this.columnToSort =columnToSort;
		this.sort = sort;
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String[] row1 = (String[]) o1;
		String[] row2 = (String[]) o1;
		return row1[columnToSort].compareTo(row2[columnToSort]);
	}
	
}
