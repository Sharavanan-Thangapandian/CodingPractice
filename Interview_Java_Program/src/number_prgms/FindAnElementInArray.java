package number_prgms;

public class FindAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3,5,93,19};
		int toFind = 190;
		boolean element = true;
		for(int i=0; i<=array.length-1; i++) {
			if(toFind == array[i]) {
				element = true;
			}
			else {
				element = false;
			}
		}
		if(element) {
			System.out.println("The element is present");
		}
		else {
			System.out.println("The element is not present");
		}

	}

}
