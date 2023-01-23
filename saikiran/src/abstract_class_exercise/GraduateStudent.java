package abstract_class_exercise;

public class GraduateStudent extends Student {
	GraduateStudent(String studentName){
		super(studentName);
	}
	public void generateResult() {
		int sum=0;
		for (int i: getTestScores()) {
			sum+=i;
		}
		int average=sum/4;
		if(average>=70)
			setTestResult("pass");
		else
			setTestResult("fail");
	}
}
