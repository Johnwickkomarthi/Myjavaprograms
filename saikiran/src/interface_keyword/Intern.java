package interface_keyword;

public class Intern implements DataProvider {
int marksSecured=0;
int graceMarks=0;
	public Intern(int marksSecured,int graceMarks)
	{
		this.graceMarks=graceMarks;
		this.marksSecured=marksSecured;
	}
	public void calcPercentage()
	{
		int toatlMarks=marksSecured+graceMarks;
		double percentage=(double) toatlMarks/totalMaximumMarks;
		System.out.println(percentage);
		
	}
}
