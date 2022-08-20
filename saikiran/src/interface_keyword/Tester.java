package interface_keyword;
class ShapeService
{
	public static void computeandDisplyArea(Sahpe s)//heere shape s is referencing circle(12)
	{												//the reference of an interface can be point to any of the object of the class implemeting that interface
		s.displayArea();							// INTERFACES CAN NERVER BE INSTANTIATED
	}
}
public class Tester {
	
	public static void main(String args[])
	{
		ShapeService.computeandDisplyArea(new Cirlce(12));
		ShapeService.computeandDisplyArea(new Rectangle(12,4));
	}
	
}
//interface is similar to an abstract class that contains only abstract methods, or rather it is a set of abstract methods.
// in java a class implements an interface, and by doing so it inherits the abstract methods that belong to that particular interface
// an interface by no means is a class even though writing an interface is a quote similar to writing a class
/*if a class is implementing an interface then all the methods of that particular interface must be overridden in that class.
 *  if not that class should be declared as an abstract class
 */
// any variable declared in interface is public-static-final
// any method declared in interface public-abstract