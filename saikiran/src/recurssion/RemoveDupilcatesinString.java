package recurssion;

public class RemoveDupilcatesinString {
public static boolean [] map= new boolean [26];
public static void removeDuplicates(String str, int idex, String newString)
{
	if (idex==str.length())
	{
		System.out.println(newString);
		return;
	}
	char currChar=str.charAt(idex);
	if (map[currChar-'a'])
	{
		removeDuplicates(str,idex+1,newString);
	}
	else
	{
		newString+=currChar;
		map[currChar-'a']=true;
		removeDuplicates(str,idex+1,newString);
	}
}
	public static void main(String[] args) {
		String str="abbccda";
		removeDuplicates(str,0,"");
	
	
	
	}

}
