package string_prgms;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurance("Sharavanan", 'a');
	}

	public static void occurance(String input, char toFind) {
		int count = 0;
		char charArray []= input.toCharArray();
		for (char ch : charArray) {
			if(ch == toFind) {
				count++;
			}
		}
		System.out.println("No of times "+toFind+" has occured in the given String: "+count);
	}

}
