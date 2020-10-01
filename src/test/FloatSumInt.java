package test;

public class FloatSumInt {
	
	public static void main(String [] agrs) {
		
		float a = 1.0f;
		float b= 2.0f;
		System.out.println("Enter the values of a and b"+ " " + addNumbers(a,b));
		
	}
	
	public static int addNumbers(float a, float b) {
		float f3 = a+b;
		return (int)Math.floor(f3);
		//return (int) f3;
	 }

}
