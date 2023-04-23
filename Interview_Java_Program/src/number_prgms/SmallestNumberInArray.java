package number_prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {30,5,93,19};
		Integer[] input1 = {3,5,93,19};
		method1(input);
		method2(input1);
		method3(input);
	}

	public static void method1(int input[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<=input.length-1; i++) {
			if(min>input[i]) {
				min = input[i];
			}
		}
		System.out.println("method1: "+min);
	}

	public static void method2(Integer input[]) {
		List<Integer> list = new ArrayList (Arrays.asList(input));
		Collections.sort(list);
		System.out.println("method2: "+list.get(0));
	}

	public static void method3(int[] input) {
		Arrays.sort(input);
		System.out.println("method3: "+input[0]);
	}
}
