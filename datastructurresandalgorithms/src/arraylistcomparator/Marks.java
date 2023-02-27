package arraylistcomparator;
import java.util.*;
import arraylist.Students;
public class Marks implements Comparator<Students>{
	@Override
	public int compare(Students o1, Students o2) {
		return o1.marks-o2.marks;
	}
}
