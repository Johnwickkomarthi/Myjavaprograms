package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {

	private int studentId;
	private String studentName;
	private int courseId;

	public Student(int studentId, String studentName, int courseId) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public boolean equals(Object student) {
		Student otherStudent = (Student) student;
		if (this.studentId == otherStudent.studentId)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student Id: "+studentId + ", Student Name: " + studentName;
	}

}


class Exercise1 {

	public static Set<Student> findDuplicateEntries(List<Student> students) {
		//Implement your logic here and change the return statement accordingly 
		Set<Student> s= new HashSet<>();
		Set<Student> s1= new HashSet<>();
		
		for (Student st: students) {
			if(s.contains(st)) {
				s1.add(st);
			}
			else
				s.add(st);
		}
		return s1;
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1001, "Dean", 111));
		students.add(new Student(1002, "Harley", 112));
		students.add(new Student(1003, "Franklin", 113));
		students.add(new Student(1005, "Arden", 113));
		students.add(new Student(1100, "Juliet", 112));
		students.add(new Student(1003, "Franklin", 111));
		students.add(new Student(1001, "Dean", 114));

		Set<Student> duplicateStudents = findDuplicateEntries(students);
		System.out.println("Students who have applied for re-evaluation in more than one subject");
		for(Student student: duplicateStudents)
		    System.out.println(student);
	}
}

/**
An university declared the end-semester exam results, after which, few students applied for re-evaluation of their answer scripts.
The university rule is that a student can apply for re-evaluation only in one subject.
The students were not aware of this rule and they applied for re-evaluation in more than one subject.
The management observed that the students were able to apply for re-evaluation in more than one subject.

You need to fetch and return the details(studentId and studentName) of the students who have applied for re-evaluation in more than one subject using a HashSet.
 Implement the logic in findDuplicateEntries() method of Tester class.

The Student class has been implemented and provided to you.

Note: Two students are considered to be the same if their studentIds are the same.

Test the functionalities using the main() method of the Tester class

Sample Input
students=[Student(1001,"Dean",111),Student(1002, "Harley",112),Student(1003,"Franklin",113), Student( 1005, "Arden",113), Student(1100,"Juliet", 112), Stude nt(1003, "Franklin", 111), Student(1001,"Dean",114)]
students=[Student(4534,"Joe",111), Student(2347,"R oss",112), Student(4534,"Joe", 112), Student(4534, "Joe", 113), Student(4534,"Joe",114)]

Expected Output
[Student(1001,"Dean"), Student(1003,"Franklin")]
[Student(4534,"Joe")]
*/