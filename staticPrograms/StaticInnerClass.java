package staticPrograms;

import staticPrograms.car.OnRoadPrice;

class car{
	private static final int price = 10000;
	//*********************************************************
		static class OnRoadPrice{
			public void display()
			{
				System.out.println("ok");
			}
			static public double priceOnRoad(String state)
			{
				switch(state)
				{
				case "West Bengal"  : return price+price*0.1;
				case "Delhi" 		: return price+price*0.15;
				case "Mumbai"		: return price+price*0.13;
				case "Goa" 			: return price+price*0.11;
				default				: return price;
				}
			}
		}
	//**********************************************************
}
public class StaticInnerClass {
	public static void main(String args[])
	{
		car.OnRoadPrice obj = new car.OnRoadPrice();
		obj.display();
		System.out.println(obj.priceOnRoad("West Bengal"));
		System.out.println(obj.priceOnRoad("Delhi"));
		System.out.println(OnRoadPrice.priceOnRoad("Goa"));
		
	}
}
