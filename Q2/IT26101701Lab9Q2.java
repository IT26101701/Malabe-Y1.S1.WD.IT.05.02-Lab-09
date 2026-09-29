import java.util.Scanner;

public class IT26101701Lab9Q2 {

    // User Defined Method that takes radius, calculates area and returns it
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
	
	
	//Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is : " + area);

    }
}