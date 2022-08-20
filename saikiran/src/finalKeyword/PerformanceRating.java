package finalKeyword;

public class PerformanceRating {
	private final static int Outstanding = 5;
	private final static int good=4;
	private final static int average=3;
	private final static int poor=2;
	

	public int getOutstanding() {
		return Outstanding;
	}


	public int getGood() {
		return good;
	}


	public int getAverage() {
		return average;
	}


	public int getPoor() {
		return poor;
	}


	static int calculatePerformance(Employee employee)
	{
		if (employee.getPoint()>80)
		return Outstanding;
		
		else if(employee.getPoint()>60 && employee.getPoint()<79)
			return good;
		else if(employee.getPoint()>50 && employee.getPoint()<79)
		return average;
		else if (employee.getPoint()>1 && employee.getPoint()<49)
			return poor;
		else 
			return 10;
	}
	

}
