import java.util.Scanner;
public class Rectangle {
	public static void main(String [] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle.");
		double Width = Scan.nextDouble();
		System.out.println("Enter the length of the rectangle.");
		double Length = Scan.nextDouble();

		double Perimeter = 2*Width+2*Length;
		double Area = Width*Length;

		System.out.println("The rectangle has a Perimeter and Area, respectively, of: " + Perimeter + " and " + Area);

	}
}
