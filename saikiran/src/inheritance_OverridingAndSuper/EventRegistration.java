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
		if (nameOfEvent.equalsIgnoreCase("shakealeg"))
		{	
			registrationFee=100;
		}
		else if (nameOfEvent.equalsIgnoreCase("sing&win"))
		{	
			registrationFee=150;
		}
		else if (nameOfEvent.equalsIgnoreCase("actathon"))
		{	
			registrationFee=70;
		}
		else if (nameOfEvent.equalsIgnoreCase("playaway"))
		{	
			registrationFee=130;
		}
		
	}
	public static void main (String args[])
	{
		TeamEventRegistration team= new TeamEventRegistration("aura","shakealeg",1,5);
		team.registerEvent();
		
		SingleEventRegistration single = new SingleEventRegistration("jenny","sing&win",2);
		single.registerEvent();
		
	}
}
