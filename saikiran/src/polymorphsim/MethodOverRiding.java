package polymorphsim;
class Pet {
	public void speak() {
		System.out.println("pet speaks");
	}
}
class Dog extends Pet{
	public void speak() {
		System.out.println("bow bow");
	}
}

class Cat extends Pet{
	public void speak() {
		System.out.println("meow");
	}
}

class Command
{
	public static void issueCommand(Pet p) {
		p.speak();
	}
}

public class MethodOverRiding {
	
	public static void main(String args[])   		
	{
	Command.issueCommand(new Pet());
	Command.issueCommand(new Dog());
	Command.issueCommand(new Cat());
	}
}
// method over riding is a technique to implememt dynamic polymorphism 
//this can be acheived by same name and signature int he base class as well as in the derived class
//method signature involves return type, method name and parameters( type, number and arrangement of parameters)


//rules
//its applies only to inherited methods
//the object type (and NOT the reference variable) determins which overriden method will be used at runtime
// overriding must have the same return type
//overriding methods must not have an access modifier that is more restrictive than that of hte overriden method(public cannot reduce by protected or private)
//static  and final methods cannot be overriden
// constructors cannot be overrriden 
// private methods cannot be overriden