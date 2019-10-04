
public class Square extends Shape{

	protected double side;
	
	Square(ShapeDescription description)
	{
		super(description);
		side = description.getDoubles().get(0);
	}
	
	public double getArea()
	{
		return Math.pow(side, 2);
	}
	
	public double getPerimeter()
	{
		return side*4;
	}
}
