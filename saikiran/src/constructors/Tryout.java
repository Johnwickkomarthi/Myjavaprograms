package constructors;

public class Tryout {
		  private String bankName, area;
		  private String phoneNumber;
		  Tryout() {    // Default constructor
		    bankName = "IBank";
		    area = "Gandhi Nagar";
		    phoneNumber = "9876543210";
		  }
		  Tryout(String bname, String barea, String phoneNo) {  // Parameterized constructor
		    bankName = bname;
		    area = barea;
		    phoneNumber = phoneNo;
		  }
		  void displayBankDetails(){
		      System.out.println("bank Name: " + bankName);
		      System.out.println("Area of bank: " + area);
		      System.out.println("Phone number of bank: " + phoneNumber);
		  }
		  
		  public static void main(String[] args){
			  Tryout bank1 = new Tryout();  //call default constructor
			  Tryout bank2 = new Tryout("IBank", "Jaydev Nagar", "8876543219"); //call Parameterized constructor
		      
		      bank1.displayBankDetails();
		      System.out.println("***********************");
		      bank2.displayBankDetails();
		  }
		
}
