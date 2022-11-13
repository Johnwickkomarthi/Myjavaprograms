package leetcode_strings;

public class Defanging_an_IP_Address {

	public static void main(String[] args) {
		String address="1.1.1.1";
		String s=address.replace(".", "[.]");
		System.out.println(s);
	}

}
