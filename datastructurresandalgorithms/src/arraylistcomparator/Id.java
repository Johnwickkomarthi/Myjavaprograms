package arraylistcomparator;
import java.util.*;
import arraylist.Students;
public class Id implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		return o1.id-o2.id;
	}
}
