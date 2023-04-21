package string_prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Sharavanan";
		
		usingStringBuffer(name);
		usingCharAt(name);
		usingToCharArray(name);
		usingCollections(name);
	}

	public static void usingStringBuffer(String name) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println("usingStringBuffer: "+buffer.reverse());
	}

	public static void usingCharAt(String name) {
		String reverse="";
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("usingCharAt: "+reverse);
	}
	
	public static void usingToCharArray(String name) {
		String reverse = "";
		char charArray []= name.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			reverse = reverse + charArray[i];
		}
		System.out.println("usingToCharArray: "+reverse);
	}
	
	public static void usingCollections(String name) {
		String reverse = "";
		String [] stringArray = name.split("");		
		List<String> stringList = new ArrayList<String>(Arrays.asList(stringArray));		
		ListIterator<String> listIT = stringList.listIterator(stringList.size());
		while(listIT.hasPrevious())
		{		
			reverse = reverse + listIT.previous();			
		}
		System.out.println("usingCollections: "+reverse);		
	}
}
