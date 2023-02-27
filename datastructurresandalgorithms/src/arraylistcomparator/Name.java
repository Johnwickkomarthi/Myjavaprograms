package arraylistcomparator;
import java.util.*;
import arraylist.Students;
public class Name implements Comparator<Students> {
	@Override
	public int compare(Students o1, Students o2) {
		return o1.string.compareTo(o2.string);
	}
}
