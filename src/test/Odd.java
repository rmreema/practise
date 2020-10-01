package test;

public class Odd {

	 public static void main(String[] args) {
		 
		int number = 357;
			int odd_digits_sum = 0;
			while (number > 0) {
			    int digit = number % 10;
			    if (digit % 2 != 0) {
				odd_digits_sum += digit;
			    }
			    //number /= 10;
			}
			System.out.println("sum"+ number+ odd_digits_sum);   
			
			//System.out.printf("number is " + number);
			
			
			
		    }
	
	
}


