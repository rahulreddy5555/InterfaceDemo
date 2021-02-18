import java.util.Scanner;

public class Student implements IMaths {


	public void add() {
		Scanner kb =new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
        System.out.println("Enter any two integer values to perform sub");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Sub of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() {
		Scanner kb =new Scanner(System.in);
        System.out.println("Enter any two integer values to perform multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("multiplication of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
        System.out.println("Enter any two integer values to perform division");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("division of "+a+" and "+b+" is "+s);
        
		
	}
		public static void main(String[] args) {
		Student s=new Student();
		s.add();
		s.sub();
		s.mul();
		s.div();

	}
}
