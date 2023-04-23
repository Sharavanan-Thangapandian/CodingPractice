package string_prgms;

public class AddNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Sharan3593";
		sum(input);
	}

	public static void sum(String input) {
		char[] ch = input.toCharArray();
		int sum = 0;
		for(int i =0; i<=ch.length-1; i++) {
			if(Character.isDigit(ch[i])) {
				sum = sum + Character.getNumericValue(ch[i]);
			}
		}
		System.out.println("sum: "+sum);
	}
}
