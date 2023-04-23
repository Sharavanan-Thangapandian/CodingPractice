package string_prgms;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Sharavanan";
		missingAlphabet(input);
	}

	public static void missingAlphabet(String input) {
		String [] inputArray = input.split("");
		String [] alphabetArray = "abcdefghijklmnopqrstuvwyz".split("");

		HashSet<String> set1 = new HashSet<String> (Arrays.asList(inputArray));
		HashSet<String> set2 = new HashSet<String> (Arrays.asList(alphabetArray));

		set2.removeAll(set1);
		System.out.println(set2);
	}

}
