package string_prgms;

public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Sharavanan";
		count(input);
	}

	public static void count(String input) {
		int count=0;
		char[] ch = input.toCharArray();
		for(int i=0; i<=ch.length-1; i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' ) {
				count++;
			}			
		}
		System.out.println("count: "+count);
	}
}
