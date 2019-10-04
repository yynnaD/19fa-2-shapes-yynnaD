
public class Triangle extends Shape{

	protected double sideA;
	protected double sideB;
	protected double sideC;
	
	Triangle(ShapeDescription description)
	{
		super(description);
		sideA = description.getDoubles().get(0);
		sideB = description.getDoubles().get(1);
		sideC = description.getDoubles().get(2);
	}
	
	public double getArea()
	{
		double s = (sideA + sideB + sideC)/2; //to use in Heron's
		return Math.sqrt(s*(s-sideA) * (s-sideB) * (s-sideC)); //Heron's formula
	}
	
	public double getPerimeter()
	{
		return sideA + sideB + sideC;
	}
}
