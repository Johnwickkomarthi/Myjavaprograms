package hustle;

import java.util.Arrays;

public class Lognest_prefix {
	public static void main(String[] args) {
		String [] array= {"geeksofgeeks", "geeks","geek","geezer"};
		// longest common prefix
		
		Arrays.sort(array);
		String res="";
		
//		for(int idx=1;idx<=array[0].length();idx++) {
//			for (int i=0;i<array.length;i++) {
//				if(!array[i].substring(0, idx).equals(array[0].substring(0, idx))) {
//					res+=array[0].substring(0,idx-1);
//					break;
//					}
//				}
//			}
		
		int idx=array[0].length()-1;
		for(;idx>=0;idx--) {
			for (int i=0;i<array.length;i++) {
				if(array[i].contains(array[0].substring(0, idx))) {
					res=array[0].substring(0, idx);
					break;
				}
			}
			if(!res.isEmpty())
				break;
		}
		System.out.println(res);
	}
}
