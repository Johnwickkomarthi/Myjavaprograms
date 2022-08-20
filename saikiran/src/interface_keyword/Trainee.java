package interface_keyword;

public class Trainee implements DataProvider{
int marksSecured=0;
public Trainee(int marksSecured)
{
	this.marksSecured=marksSecured;
}
public void calcPercentage()
{
	System.out.println((double) marksSecured/totalMaximumMarks);
}
}
