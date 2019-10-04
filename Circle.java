
public class Circle extends Shape{
	
	protected double radius;
	
	Circle(ShapeDescription description)
	{
		super(description);
		radius = description.getDoubles().get(0);
	}
	
	//pi*r^2
	public double getArea()
	{
		return Math.pow(radius, 2) * Math.PI;
	}

	//2*pi*r
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
}
