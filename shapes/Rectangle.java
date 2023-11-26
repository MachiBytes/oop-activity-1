package shapes;

import java.util.Scanner;

public class Rectangle extends Shape {
	private double dblLength;
	private double dblBreadth;

	public void getMeasurements() {
		Scanner objScanner = new Scanner(System.in);
		System.out.print("Length: ");
		this.dblLength = objScanner.nextDouble();
		System.out.print("Breadth: ");
		this.dblBreadth = objScanner.nextDouble();
	}
	public double getArea() {
		double dblArea = this.dblLength * this.dblBreadth;
		return dblArea;
	}
	public String toString() {
		return "Object of type Rectangle:\n\tLength: " + this.dblLength + "\n\tBreadth: " + this.dblBreadth;
	}
}