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
	this.noOfParticipant=noOfParticipant;
	this.teamNo=teamNo;
}

	public void registerEvent()
	{
		
	}
}
