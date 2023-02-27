package arraylist;
import java.util.*;
public class Students{
	
	public String string;
	public int id;
	public int marks;
	public Students(String string, int id, int marks) {
		this.string = string;
		this.id = id;
		this.marks = marks;
	}
	
//	public int compareTo(Students o) {
//		return this.marks-o.marks;
//	}
	
	@Override
	public String toString() {
		return "Students [string=" + string + ", id=" + id + ", marks=" + marks + "]";
	}
	
	
	
}
