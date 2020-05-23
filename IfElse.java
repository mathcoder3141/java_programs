//Scanner class in util package
import java.util.Scanner;

public class IfElse{
	public static void main(String[] args) {
		// scanner object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		boolean b = n % 2
		if (b){
			System.out.println("Yay, you entered an even number");
		}
		else {
			System.out.println("Mmm...you entered an odd number");
		}
	}
}