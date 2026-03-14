//GAURANG SACHIN PATIL//
//23CE1174//
//B2//
import java.util.*;
class Exp4{
	void Figure(double r){
		double a1;
		a1=3.14*r*r;
		System.out.println("Area of circle="+a1+"units");
	}
	void Figure(int side){
		double a2;
		a2=side*side;
		System.out.println("Area of square="+a2+"units");
	}
	void Figure(int length,int breadth){
		double a3;
		a3=length*breadth;
		System.out.println("Area of rectangle="+a3+"units");
	}
	void Figure(double base,double height){
		double a4;
		a4=0.5*base*height;
		System.out.println("Area of triangle="+a4+"units");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Exp4 ar=new Exp4();
		System.out.println("Enter radius of circle");
		double r=sc.nextDouble();
		ar.Figure(r);
		System.out.println("Enter side of square");
		int side=sc.nextInt();
		ar.Figure(side);
		System.out.println("Enter length and breadth of rectangle");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		ar.Figure(length,breadth);
		System.out.println("Enter base and height of triangle");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		ar.Figure(base,height);
	}
}
//Output//
C:\Users\Lenovo\Desktop\GAURANG JAVA>java Exp4
Enter radius of circle
5
Area of circle=78.5units
Enter side of square
6
Area of square=36.0units
Enter length and breadth of rectangle
57
91
Area of rectangle=5187.0units
Enter base and height of triangle
3.4
4.9
Area of triangle=8.33units
		
		
		
		
		
		