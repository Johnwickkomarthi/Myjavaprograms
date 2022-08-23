package exceptionHandling;

public class ExceptionDemo {
		public static int divide(int a, int b)
		{
			return a/b;
		}
	public static void main(String[] args) {
		
		try
		{
			divide(9,0);
		}
		catch (ArithmeticException exception)
		{
			System.out.println(exception);
			//exception.println(exception);
		//	System.out.println(exception.getMessage());
			//System.out.println(exception.toString());
		}
		finally
		{
			System.out.println("Inside finally");
		}
	}

}
