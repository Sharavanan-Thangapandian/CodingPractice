package string_prgms;

public class ReplaceVowelsSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceVowels("Sharavanan", '#');
		replaceVowels("Sharavanan", '$');

		replaceVowels("Sharavanan", "//&");
		replaceVowels("Sharavanan", "//$");
	}

	public static void replaceVowels(String input, char specialChar) {
		String replaceVowel="";
		char [] charArray = input.toCharArray();
		for(int i = 0; i <= input.length()-1; i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' ) {
				charArray[i]=specialChar;
			}
		}
		for(int i = 0; i<=charArray.length-1; i++) {
			replaceVowel = replaceVowel + charArray[i];			
		}
		System.out.println("replaceVowels_1: "+replaceVowel);
	}

	public static void replaceVowels(String input, String specialChar) {
		String replacedVowels = input.replaceAll("[AEIOUaeiou]", "#");
		System.out.println("replaceVowels_2: "+replacedVowels);
	}
}
