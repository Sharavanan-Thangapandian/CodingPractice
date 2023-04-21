package string_prgms;

import java.util.Arrays;
import java.util.List;

public class LengthOfString_WithOutLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getStringLength("Sharavanan");
	}
	
	public static void getStringLength(String input) {
		String [] stringArray = input.split("");
		List<String> stringList = Arrays.asList(stringArray);
		System.out.println(stringList.size());
	}

}
