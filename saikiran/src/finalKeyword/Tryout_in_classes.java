package finalKeyword;

final class Tryout_in_classes {
	
		int tenure = 0;
		double principal;
		float interestRate;
		String accountNumber;
	    double calculateEMI(){
			return 2000;
		}
	}

	  class Dummy extends Tryout_in_classes{
	  
	  // Error as  class is final
	  double calculateEMI(){
			return 8000;
		}
	  
	  }	

	class FinalDemo{
		public static void main(String[] args) {
			Tryout_in_classes d = new Tryout_in_classes();
			System.out.println(d.tenure);
			System.out.println(d.calculateEMI());
		}
	}
