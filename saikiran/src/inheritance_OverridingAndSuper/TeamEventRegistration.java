package inheritance_OverridingAndSuper;

public class TeamEventRegistration extends EventRegistration{
private int noOfParticipant;
private int teamNo;
public int getNoOfParticipant() {
	return noOfParticipant;
}
public void setNoOfParticipant(int noOfParticipant) {
	this.noOfParticipant = noOfParticipant;
}
public int getTeamNo() {
	return teamNo;
}
public void setTeamNo(int teamNo) {
	this.teamNo = teamNo;
}
public TeamEventRegistration(String name, String nameOfEvent,int noOfParticipant,int teamNo) 
{
	super (name,nameOfEvent);
	this.noOfParticipant=noOfParticipant;
}

	public void registerEvent()
	{
		if (getNameOfEvent().equalsIgnoreCase("shakealeg"))
		{	
			setRegistrationFee(100);
			System.out.println("Thankyou"+getName()+"for your participation. Your regestration fee is"+getRegistrationFee()*noOfParticipant);
			System.out.println("You are participant no:"+noOfParticipant);
		}
		else if (getNameOfEvent().equalsIgnoreCase("sing&win"))
		{	
			setRegistrationFee(150);
			System.out.println("Thankyou"+getName()+"for your participation. Your regestration fee is"+getRegistrationFee()*noOfParticipant);
			System.out.println("You are participant no:"+noOfParticipant);
		}
		else if (getNameOfEvent().equalsIgnoreCase("actathon"))
		{	
			setRegistrationFee(70);
			System.out.println("Thankyou"+getName()+"for your participation. Your regestration fee is"+getRegistrationFee()*noOfParticipant);
			System.out.println("You are participant no:"+noOfParticipant);
		}
		else if (getNameOfEvent().equalsIgnoreCase("playaway"))
		{	
			setRegistrationFee(130);
			System.out.println("Thankyou"+getName()+"for your participation. Your regestration fee is"+getRegistrationFee()*noOfParticipant);
			System.out.println("You are participant no:"+noOfParticipant);
		}
		else
			System.out.println("please choose a valid event");
	}
}
