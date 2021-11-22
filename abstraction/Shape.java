package abstraction;

abstract class Shape1 {
	abstract double perimeter();
	abstract double area();
}

class circle extends Shape1{
	double radius;
	circle(double radius)
	{
		this.radius=radius;
	}
	
	double perimeter()
	{
		return 2*3.14*this.getRadius();
	}
	double area() {
		return 3.14*this.getRadius()*radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}


class Shape{
	public static void main(String args[]) {
		Shape1 s = new circle(3);
		System.out.println(s.area());
		System.out.println(s.perimeter());
	}
}