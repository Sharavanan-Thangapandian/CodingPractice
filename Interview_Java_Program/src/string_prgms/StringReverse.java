package string_prgms;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Sharavanan";
		usingStringBuffer(name);
	}

	public static void usingStringBuffer(String name) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		System.out.println(buffer.reverse());
	}
}
