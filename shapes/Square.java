package shapes;

import java.util.Scanner;

public class Square extends Shape {
	private double dblSide;

	public void getMeasurements() {
		Scanner objScanner = new Scanner(System.in);
		System.out.print("Side: ");
		this.dblSide = objScanner.nextDouble();
	}
	public double getArea() {
		double dblArea = this.dblSide * this.dblSide;
		return dblArea;
	}
	public String toString() {
		return "Object of type Square:\n\tSide:" + this.dblSide;
	}
}