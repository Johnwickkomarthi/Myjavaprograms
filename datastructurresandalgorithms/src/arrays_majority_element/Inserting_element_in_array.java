package arrays_majority_element;

class ArrayTest{
	public static void insert (char [] ar, int pos,char val) {
		for (int i=ar.length-1;i>=pos;i--) {
			ar[i]=ar[i-1];
		}
		ar[pos-1]=val;
	}
}

class Inserting_element_in_array {

	public static void main(String[] args) {
		char []arr=new char[6];
		arr[0]='a';
		arr[1]='b';
		arr[2]='c';
		arr[3]='d';
		arr[4]='e';
		
		ArrayTest.insert(arr, 3,'j');
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
