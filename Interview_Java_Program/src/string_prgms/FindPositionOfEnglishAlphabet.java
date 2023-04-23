package string_prgms;

public class FindPositionOfEnglishAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		int initalAsciiLowerCase = 96;
		int initialAsciiUpperCase = 64;
		
		findPosition('a', initalAsciiLowerCase);
		findPosition('A', initialAsciiUpperCase);

	}

	public static void findPosition(char ch, int asciiValue) {
		int asciiPosition = (int) ch;
		int position = asciiPosition - asciiValue;
		System.out.println("Small letter: "+position);		
	}
}
