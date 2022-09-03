package recurssion;

public class FirstLastOccrance {
public static int first=-1;
public static int last=-1;
	public void findOccrance(String s,int idex,char element)
	{
		if (idex==s.length())
		{
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currchar=s.charAt(idex);
		if (currchar==element)
		{
			if (first==-1)
				first=idex;
			else
				last=idex;
		}
		findOccrance(s,idex+1,element);
	}
	public static void main(String[] args) {
		
		String str="abaacdaefaab";
		FirstLastOccrance a= new FirstLastOccrance();
		a.findOccrance(str,0,'a');
	}

}
