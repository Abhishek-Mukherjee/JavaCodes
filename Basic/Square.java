package Basic;
import java.util.*;
class rectangle{
	private
		double length,breadth;
	public
	
	// this two methods is used to set length and breadth
		void setLength(double l)
		{
			if(l>0)
			length=l;
			else
			{
				System.out.println("Length cannot be negetive");
				length=0;
			}
		}
		void setBreadth(double b)
		{
			if(b>0)
			breadth=b;
			else
			{
				System.out.println("Breadth cannot be negetive");
				breadth=0;
			}
		}
		
	// this two methods is used to return length and breadth values
		double getLength()
		{
			return length;
		}
		double getBreadth()
		{
			return breadth;
		}
		
	// calculate area
		double areaCalculate()
		{
			return getLength()*getBreadth();
		}
		
	// calculate perimeter
		double perimeter()
		{
			return (double)2*(getLength()+getBreadth());
		}
}
public class Square {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		rectangle object = new rectangle();
		
		System.out.print("Enter Length: ");
		object.setLength(sc.nextDouble());
		System.out.print("Enter Breadth: ");
		object.setBreadth(sc.nextDouble());
		
		System.out.println("Length and breadth of the rectangle is : "+object.getLength()+" and "+object.getBreadth());
		System.out.println("Area of the rectangle is: "+object.areaCalculate());
		System.out.println("Perimeter of the rectangle is: "+object.perimeter());
	}
}
