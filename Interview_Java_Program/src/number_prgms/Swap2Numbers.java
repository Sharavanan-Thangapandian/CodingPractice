package number_prgms;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingThirdVariable(5,10);
		usingAddSub(5,10);
	}

	public static void usingThirdVariable(int a1, int a2) {
		System.out.println("Before Swap");
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
		int temp;
		temp = a1;
		a1 = a2;
		a2 = temp;
		System.out.println("After Swap");
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
	}

	public static void usingAddSub(int a1, int a2) {
		System.out.println("Before Swap");
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
		a1 = a1 - a2;
		a2 = a1 + a2;
		a1 = a2 - a1;
		System.out.println("After Swap");
		System.out.println("a1: "+a1);
		System.out.println("a2: "+a2);
	}
}
