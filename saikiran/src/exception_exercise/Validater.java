package exception_exercise;

public class Validater extends Applicant{

	public boolean validateName() {
		if(getName().equals(""))
			return false;
		else if(getName().equals(null))
			return false;
		else
			return true;
	}
	public boolean validateJobProfile() {
		if(getJobProfile().equalsIgnoreCase("Associate"))
			return true;
		else if(getJobProfile().equalsIgnoreCase("Clerk"))
			return true;
		else if(getJobProfile().equalsIgnoreCase("Executive"))
			return true;
		else if(getJobProfile().equalsIgnoreCase("Officer"))
			return true;
		else
			return false;
	}
	public boolean validateAge() {
		if(getAge()<=18 && getAge()>=30)
			return true;
		else
			return false;
		
	}
	public void validate(Applicant applicant) {
		
	}
}
