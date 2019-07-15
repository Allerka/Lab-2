import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// Initial setup
		Scanner scan = new Scanner(System.in);
		float length;
		float width;
		float height;
		float area;
		float volume;
		float perimeter;
		String cont;

		// initial prompt
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		do {
			// getting input
			System.out.print("Enter Length: ");
			length = scan.nextFloat();
			System.out.print("Enter Width: ");
			width = scan.nextFloat();
			System.out.print("Enter Height: ");
			height = scan.nextFloat();

			// calculate area and perimeter
			area = length * width;
			volume = length * width * height;
			perimeter = length + length + width + width;
			System.out.println("Area: " + area + " sq/ft");
			System.out.println("Perimeter: " + perimeter + " ft");
			System.out.println("Volume: " + volume + " cu/ft");

			// continue prompt
			System.out.print("Continue? (y/n): ");
			cont = scan.next();
		} while (cont.equalsIgnoreCase("y"));
		scan.close();
	}

}
