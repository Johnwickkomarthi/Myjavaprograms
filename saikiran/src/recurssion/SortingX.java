package recurssion;

public class SortingX {
public static void moveAllX(String str, int idex, int count, String newString)
{
	if (idex==str.length())
	{
		for (int i=0;i<count;i++)
		{
			newString+='X';
		}
		System.out.println(newString);
		return;
	}
	char currChar=str.charAt(idex);
	if (currChar=='X')
	{
		count++;
		moveAllX(str,idex+1,count,newString);
	}
	else
	{
		newString+=currChar;
		moveAllX(str,idex+1,count,newString);
	}
}
	public static void main(String[] args) {
		moveAllX("AXBAXXJJXJXXGX",0,0,"");
		
	}

}
