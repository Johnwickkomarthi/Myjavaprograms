package recurssion;

public class ReverseString {
	public void printrev(String str, int idx)
	{
		if (idx==0)
		{
			System.out.print(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
		printrev(str,idx-1);
	}
	public static void main(String[] args) {
		String sr="abcd";
		ReverseString obj= new ReverseString();
		obj.printrev(sr,sr.length()-1);

	}

}
