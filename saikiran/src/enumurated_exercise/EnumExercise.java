package enumurated_exercise;

public class EnumExercise {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setStudentId(1000);
		s1.setName("alvin");
		s1.setTotalMarks(280);
		s1.calculateGrade();
		s1.calculateScholarshipAmount();
		System.out.println("student details");
		System.out.println("student Id:"+s1.getStudentId());
		System.out.println("student name:"+s1.getName());
		System.out.println("student grade :"+s1.getGrade());
		System.out.println("scholarship amount:"+s1.getScholarshipAmount());

	}

}
