package interface_keyword;

public class Rectangle implements Sahpe {
	private double length;
	private double breadth;
	public Rectangle(double length,double breadth ) 
	{
		this.breadth=breadth;
		this.length=length;
	}
	public void displayArea()
	{
	System.out.println("area of the recatangle "+length*breadth);
	}
}
