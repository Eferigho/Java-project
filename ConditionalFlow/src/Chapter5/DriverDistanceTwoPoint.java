package Chapter5;
import java.util.Scanner;
public class DriverDistanceTwoPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DistanceTwoPoint dtp = new DistanceTwoPoint();
		//dtp.setPoint1();
		Scanner input = new Scanner(System.in);
		double x1, x2, y1, y2;
		System.out.println("Enter value for x2");
		x2 = input.nextDouble();
		System.out.println("Enter value for x1");
		x1 = input.nextDouble();
		System.out.println("Enter value for y2");
		y2 = input.nextDouble();
		System.out.println("Enter value for y1");
		y1 = input.nextDouble();
		double point1 = (x2 - x1) * (x2 - x1);
		double point2 = (y2 - y1) * (y2 - y1);
		distance(point1,point2);
	}

	public static double distance(double point1, double point2) {
		double distance = 0;
		distance = (point1 + point2) * (point1 + point2);
		System.out.printf("The Distance between Point1 %.2f  and %.2f is : %.2f",point1,point2,distance);
		return distance;
		
	}
}
