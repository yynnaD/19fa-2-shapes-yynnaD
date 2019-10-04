
public class FunWithShapes extends ShapeHandler{
	
	//problems here
	public static void main(String [] args)
	{
		try {
		FunWithShapes x = new FunWithShapes();
		System.out.println(x.sumOverAreas());
		System.out.println(x.sumOverPerimeters());
		
		
		}
		catch(ShapeException e) {
			System.out.println("Error: " + e);
		}
	}
	
	public FunWithShapes() throws ShapeException
	{
		super();
	}
	
	public void convertDescriptionsToShapes(){
		
		for(int i = 0; i < shapeDescriptions.size(); i++)
		{
			ShapeDescription.ShapeTypes shape = shapeDescriptions.get(i).getShapeType();
			if(shape == ShapeDescription.ShapeTypes.SQUARE) 
			{
				Square s = new Square(shapeDescriptions.get(i));
				shapes.add(s);
			}
			else if(shape == ShapeDescription.ShapeTypes.CIRCLE)
			{
				Circle c = new Circle(shapeDescriptions.get(i));
				shapes.add(c);
			}
			else if(shape == ShapeDescription.ShapeTypes.RECTANGLE)
			{
				Rectangle r = new Rectangle(shapeDescriptions.get(i));
				shapes.add(r);
			}
			else
			{
				Triangle t = new Triangle(shapeDescriptions.get(i));
				shapes.add(t);
			}
			
		}
	}
	
	public double sumOverAreas()
	{
		double area = 0;
		for(int i = 0; i < shapes.size(); i++)
		{
			area+= shapes.get(i).getArea();
		}
		return area;
	}
	public double sumOverPerimeters()
	{
		double perimeter = 0;
		for(int i = 0; i < shapes.size(); i++)
		{
			perimeter+= shapes.get(i).getPerimeter();
		}
		return perimeter;
	}
	
	
}
