package inheritance_OverridingAndSuper;

public class EventRegistration {
private String name;
private String nameOfEvent;
private double registrationFee;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNameOfEvent() {
	return nameOfEvent;
}
public void setNameOfEvent(String nameOfEvent) {
	this.nameOfEvent = nameOfEvent;
}
public double getRegistrationFee() {
	return registrationFee;
}
public void setRegistrationFee(double registrationFee) {
	this.registrationFee = registrationFee;
}

	public EventRegistration(String name, String nameOfEvent)
	{
		this.name=name;
		this.nameOfEvent=nameOfEvent;
		
	}
	
	public void registerEvent()
	{
		
	}
	public static void main (String args[])
	{
		
	}
}
