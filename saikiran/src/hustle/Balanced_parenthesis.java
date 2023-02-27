package hustle;

public class Balanced_parenthesis {

	public static void main(String[] args) {
		String []array= {")())",")","((","((","(",")",")"};
		String str="";
		for (String s:array) {
			str+=s;
		}
		
		int count=0;
		int idx=2;
		for (int i=0;i<str.length()-1;i++,idx++) {
			if(str.substring(i, idx).equals("()"))
					count++;
		}
		System.out.println(count);
	}

}
