package number_prgms;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber(3593);
	}
	
	public static void reverseNumber(int number) {
		int reverse=0;
		number = number *10;
		while(number!=0) {
			reverse = reverse * 10;
			reverse = reverse + number %10;
			number = number / 10;
		}		
		System.out.println(reverse);		
	}

}
