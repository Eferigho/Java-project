package Chapter5;
import java.util.Scanner;
public class DistanceTwoPoint {
private double x1, x2, y1,y2;
private double point1, point2;
private double distance;

	Scanner input = new Scanner(System.in);
	public void setPoint1() {
		System.out.println("Enter Value for x1");
		x1 = input.nextDouble();
		System.out.println("Enter Value for x2");
		x2 = input.nextDouble();
		point1 = (x2 - x1) * (x2 - x1); 
		setPoint2();
	}
	public double getPoint1() {
		return point1;
	}
	public void setPoint2() {
		System.out.println("Enter Value for y1");
		y1 = input.nextDouble();
		System.out.println("Enter Value for y2");
		y2 = input.nextDouble();
		point2 = (y2 - y1) * (y2 - y1); 
		setDistance();
	}
	public double getPoint2() {
		return point2;
	}
	public void setDistance() {
		distance = (point1 + point2) * (point1 + point2);
	}
	public double getDistance() {
		return distance;
	}
	public void display() {
		System.out.printf("Your Point 1 is : %.2f and your point 2 is : %.2f  and the Distance is : %.2f",point1,point2,distance);
	}
}
