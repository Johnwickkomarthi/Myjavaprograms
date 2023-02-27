package geca20;

import java.util.ArrayList;
import java.util.ListIterator;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=1;i<=8;i++) {
			list.add(i);
		}
		
		ListIterator<Integer> itr=list.listIterator();
		while(itr.hasNext()) {
			if(prime(itr.next()))
				itr.remove();
			
		}
		System.out.println(list);
	}
	public static boolean prime(int n) {
		if (n==1)
			return false;
		
		for (int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
