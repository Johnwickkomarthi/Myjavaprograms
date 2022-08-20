package interface_keyword;

public class Cirlce implements Sahpe{
	private double radius;
	public Cirlce (double radius)
	{
		this.radius=radius;
	}

	public void displayArea() {
		// TODO Auto-generated method stub
		System.out.println("area of hte circle "+Sahpe.PI*radius*radius);
	}
}
// its mandatory to implement the methods inside Sahpe interface
// if we declare the class as abstract class there is no problem