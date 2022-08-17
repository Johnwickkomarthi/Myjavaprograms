package inheritance_OverridingAndSuper;

public class SingleEventRegistration extends EventRegistration{
	private int participantNo;

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	public SingleEventRegistration(String name,String nameOfEvent,int participantNo)
	{
		super(name,nameOfEvent);
		
	this.participantNo=participantNo;
	}
	public void registerEvent() {
		if (getNameOfEvent().equalsIgnoreCase("shakealeg"))
		{	
			setRegistrationFee(100);
			System.out.println("Thankyou"+getName()+"for your participation. Your regestration fee is"+getRegistrationFee());
			System.out.println("You are participant no:"+participantNo);
		}
		else if (getNameOfEvent().equalsIgnoreCase("sing&win"))
		{	
			setRegistrationFee(150);
			System.out.println("Thankyou"+getName()+"for your participation. Your regestration fee is"+getRegistrationFee());
			System.out.println("You are participant no:"+participantNo);
		}
		else if (getNameOfEvent().equalsIgnoreCase("playaway"))
		{	
			setRegistrationFee(130);
			System.out.println("Thankyou"+getName()+"for your participation. Your regestration fee is"+getRegistrationFee());
			System.out.println("You are participant no:"+participantNo);
		}
		else
			System.out.println("please choose a valid event");
	}
}
