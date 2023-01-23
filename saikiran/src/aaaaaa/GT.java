package aaaaaa;

public class GT {
	String name;
	double tp;
	double twp;
	double dp;
	int nOB;
	
	public GT(String name, double tp, double twp) {
		this.name=name;
		this.tp=tp;
		this.twp=twp;
	}
	public GT(String name, double tp, double twp,double dp, int nOB) {
		this(name, tp, twp);
		this.nOB=nOB;
		this.dp=dp;
		}
	
	public void display() {
		System.out.println("Name of the trainee : "+this.name);
		System.out.println("tenth percentage : "+this.tp);
		System.out.println("twelth percentage : "+this.twp);
		if(this.nOB==0)
		System.out.println("no of backlogs: "+this.nOB);
		if(this.dp==0.0)
		System.out.println(" degree percentage :"+this.dp);
	}
}
