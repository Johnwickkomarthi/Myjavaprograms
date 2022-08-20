package finalKeyword;

public class Circle {
private double radius;
private double area;
private double PI= 3.14; // here the final word is not used but the varible is decleared in UPPER CASE "PI"
public Circle(double r)
{
	radius=r;
}
public double findArea()
{
	area=PI*radius*radius;
	return area;
}
	public static void main (String args[])
	{
		Circle circle1= new Circle(12.5);
		System.out.println("Area="+circle1.findArea());
		System.out.println();
		Circle circle2= new Circle(15.5);
		System.out.println("Area="+circle2.findArea());
	}
}
//final can be applied to varibles, methods, classes
//final keyword can be used to prevent variables from having value change, prevent method overriding, prevent inheritance of a class
//a final variable that is not initialized at the time of decelaration is called as blank final variable
//a blank final variable should be initialized only within a constructor