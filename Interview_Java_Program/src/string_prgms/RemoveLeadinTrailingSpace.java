package string_prgms;

public class RemoveLeadinTrailingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = " Hello World ";
		leadtingTrailing(input);
		leadting(input);
		Trailing(input);
	}

	public static void leadtingTrailing(String input) {
		System.out.println("leadtingTrailing: "+input.replaceAll("^[ /t]+|[ /t]+$",""));
	}

	public static void leadting(String input) {
		System.out.println("leadting: "+input.replaceAll("^[ /t]",""));
	}

	public static void Trailing(String input) {
		System.out.println("Trailing: "+input.replaceAll("[ /t]+$",""));
	}
}
