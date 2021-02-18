
public class ShapeTest {

	public static void main(String[] args) {
		Circle c=new Circle(6);
		Shape s=new Circle(6);
		s.draw();
		System.out.println(((Circle) s).getRadius());
		System.out.println("Area is : "+s.getArea());
		
		Shape s2=new Rectangle(3, 7);
		s2.draw();
		System.out.println("Area of rectangle : "+s2.getArea());
	}

}
