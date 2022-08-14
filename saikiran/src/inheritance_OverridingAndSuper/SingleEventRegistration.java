package inheritance_OverridingAndSuper;

public class SingleEventRegistration extends EventRegistration{
	private int participantNo;

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	public SingleEventRegistration(String name, String nameOfEvent,int participantNo)
	{
		this.participantNo=participantNo;
	
	}
	public void registerEvent() {
		
	}
}
