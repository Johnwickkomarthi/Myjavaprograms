package aaaaaa;
import java.util.*;
//4 3 6 1 0
public class MultipleCatch {
	private int s=0;
public int getStr() {
		return s;
	}
	public void setStr(int s) {
		this.s = s;
	}
public static void main(String args[]) {
	MultipleCatch h=new MultipleCatch();
	h.setStr(10);
	System.out.println(h.getStr());
	
}
}