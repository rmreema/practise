package test;

public class EricaBob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String erica = "EMH";
		String bob ="EMH";
		System.out.println(winner(erica,bob)+"Got the maximum score");
	}
	public static String winner(String erica, String bob) {
		int ericaScore = 0;
		int bobScore = 0;

		for (int i = 0; i < erica.length(); i++) {
			ericaScore += scoreGenerator(erica.charAt(i));	
		}
		System.out.println("Erica score"+ericaScore);
		for (int i = 0; i < bob.length(); i++) {
			bobScore += scoreGenerator(bob.charAt(i));	
		}
		System.out.println("Bob score"+bobScore);
		if(ericaScore == bobScore) {
			return "Tie";
			}
			else if(ericaScore > bobScore) {
			return "Erica";
			}
			else if(ericaScore < bobScore) {
				return "Bob";
				}
				return "";

	}
	
	public static int scoreGenerator(char ch) {
		if (ch == 'E') {
			return 1;
			} else if (ch == 'M') {
			return 3;
			} else if (ch == 'H') {
			return 5;
			}
			return -1;
			
	}

}
