package string_prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I love Selenium and Core Java";
		method1(input);
		method2(input);
	}

	public static void method1(String input) {
		String [] inputArray = input.split(" ");
		String reverse="";
		for(int i= inputArray.length-1; i>=0; i--) {
			reverse = reverse + inputArray[i] + " ";
		}
		System.out.println("method1: "+reverse);
	}
	
	public static void method2(String input) {
		String [] inputArray = input.split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(inputArray));
		String reverse = "";
		ListIterator <String> it = list.listIterator(list.size());
		while(it.hasPrevious())
		{
			reverse = reverse + it.previous() + " ";
		}
		System.out.println("method2: "+reverse);
	}
}
