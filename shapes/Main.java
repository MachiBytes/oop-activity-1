package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char charChoice = chooseShape();

		if (charChoice == '1') {
			Square objSquare = new Square();
			objSquare.getMeasurements();
			double dblArea = objSquare.getArea();
			System.out.println("Area: " + dblArea);
		} else if (charChoice == '2') {
			Rectangle objRectangle = new Rectangle();
			objRectangle.getMeasurements();
			double dblArea = objRectangle.getArea();
			System.out.println("Area: " + dblArea);
		} else {
			Circle objCircle = new Circle();
			objCircle.getMeasurements();
			double dblDiameter = objCircle.getDiameter();
			System.out.println("Diameter " + dblDiameter);
		}
	}

	public static char chooseShape() {
		Scanner objScanner = new Scanner(System.in);
		char charChoice = '0';
		while (charChoice != '1' && charChoice != '2' && charChoice != '3') {
			System.out.println("Calculate the area of:");
			System.out.println("----------------------------");
			System.out.println("\t1 - Square");
			System.out.println("\t2 - Rectangle");
			System.out.println("\t3 - Circle");
			System.out.print("Choose a shape (1, 2, 3): ");
			charChoice = objScanner.next(".").charAt(0);
		}
		return charChoice;
	}
}