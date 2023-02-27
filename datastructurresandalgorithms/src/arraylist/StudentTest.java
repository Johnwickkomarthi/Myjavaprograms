package arraylist;
import java.util.*;

import arraylistcomparator.*;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Students> list= new ArrayList<Students>();
		list.add(new Students("varma",1,64));
		list.add(new Students("karma",3,99));
		list.add(new Students("sharma",420,16));
		list.add(new Students("barma",7,34));
		Collections.sort(list,new Name());
		System.out.println(list);

	}
}
