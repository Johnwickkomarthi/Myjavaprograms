package arraylist;
import java.util.*;
public class MarksList {

	public static void main(String[] args) {
		TreeSet<Students> set= new TreeSet<Students>();
		set.add(new Students("varma",1,64));
		set.add(new Students("karma",3,99));
		set.add(new Students("sharma",420,16));
		set.add(new Students("barma",7,34));
		set.add(new Students("varma",1,80));
		set.add(new Students("karma",3,99));
		set.add(new Students("sharma",20,50));
		set.add(new Students("barma",7,90));
//		System.out.println(set);
		Students s = null;
		Iterator itr=set.iterator();
		int max=0;
		while(itr.hasNext() && max<=set.size()-3) {
			s=(Students)itr.next();
			max++;
		}

		System.out.println(s);
	}

}
