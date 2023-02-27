package cognigent;

public class Reliance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sameGroupStudent(2,123228);
	}
	public static void sameGroupStudent(int particularGroup,int studentGroup) {
		int count=0;
		while(studentGroup!=0) {
			int rem=studentGroup%10;
			if(particularGroup==rem)
				count++;
			studentGroup/=10;
				
		}
		System.out.print(count);
	}
}
