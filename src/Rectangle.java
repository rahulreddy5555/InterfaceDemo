
public class Rectangle implements Shape {
	int length,breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void draw() {
		System.out.println("Drawing rectangle");

	}

	
	public double getArea() {
		return (this.length*this.breadth);
	}

}
