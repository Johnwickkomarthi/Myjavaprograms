package MethodOverLoadingExercise;

public class Bill {
		public int  findPrice(int iteamId)
		{
			int price =0;
			if (iteamId==1001)
			{
				price=25;
				System.out.println("Price of the selected item is $"+price);
			}
			else if (iteamId==1002)
			{
				price=20;
				System.out.println("Price of the selected item is $"+price);
			}
			else if (iteamId==1003)
			{
				 price=23;
				System.out.println("Price of the selected item is $"+price);
			}
			else if (iteamId==1004)
			{
				 price=23;
				System.out.println("Price of the selected item is $"+price);
			}
			else
			return price;
			return price;
			
		}
		
		public int findPrice(String brandName,String iteamType,int size)
		{
			int price =0;
			
			if (brandName.equalsIgnoreCase("puma"))
			{
				if (iteamType.equalsIgnoreCase("t-shirt"))
				{
					price=25;
					System.out.println("Price of the selected item is $"+price);
				}
				else if (iteamType.equalsIgnoreCase("skirt"))
				{
					price=20;
					System.out.println("Price of the selected item is $"+price);
				}
			}
			else if (brandName.equalsIgnoreCase("reebook"))
			{
				if (iteamType.equalsIgnoreCase("t-shirt"))
				{
					price=23;
					System.out.println("Price of the selected item is $"+price);
				}
				else if (iteamType.equalsIgnoreCase("skirt"))
				{
					price=28;
					System.out.println("Price of the selected item is $"+price);
				}
			}
			else
				
				return price;
			return price;
		}
}
