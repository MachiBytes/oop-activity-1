package shapes;

import java.util.Scanner;

public class Circle extends Shape {
	private double dblRadius;
	public void getMeasurements() {
		Scanner objScanner = new Scanner(System.in);
		System.out.print("Radius: ");
		this.dblRadius = objScanner.nextDouble();
	}
	public double getDiameter() {
		double dblDiameter = this.dblRadius * 2;
		return dblDiameter;
	}
	public String toString() {
		return "Object of type Circle:\n\tRadius: " + this.dblRadius;
	}
}