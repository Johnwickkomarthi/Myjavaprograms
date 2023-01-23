package abstract_class_exercise;

public abstract class Student {
	private String studentName;
	private int[] testScores=new int [4];
	private String testResult;
	
	Student(String studentName){
		this.studentName=studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getTestScores() {
		return testScores;
	}
	public void setTestScore(int testNumber,int testScore) {
		this.testScores[testNumber]=testScore;
	}
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	public abstract void generateResult();
	
}
