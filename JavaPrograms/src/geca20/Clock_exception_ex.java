package geca20;

public class Clock_exception_ex {
	private int sec;
	private int min;
	private int hr;
	
	public Clock_exception_ex(int hr, int min,int sec){
		if((0<=hr && hr<=24) && (0<=min && min<60)&&(0<=sec && sec<60)) {
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		}
		else
			throw new TimeisIncorectException();
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if ((0<=sec && sec<=60))
		this.sec = sec;
		else
			throw new TimeisIncorectException();
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if ((0<=min && min<=60))
		this.min = min;
		else
			throw new TimeisIncorectException();
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		if ((0<=hr && hr<=24))
		this.hr = hr;
		else
			throw new TimeisIncorectException();
	}
	public void displayTime() {
		System.out.println(this.hr+":"+this.min+":"+this.sec);
	}
	
}
