
public class Rectangle extends Shape{
	
	protected double height;
	protected double width;
	

	Rectangle(ShapeDescription description)
	{
		super(description);
		height = description.getDoubles().get(0);
		width = description.getDoubles().get(1);
	}
	
	public double getArea()
	{
		return height * width;
	}
	
	public double getPerimeter()
	{
		return (2*height) + (2*width);
	}
}
