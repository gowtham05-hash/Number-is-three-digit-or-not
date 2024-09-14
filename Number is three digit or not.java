import java.util.Scanner;

public class Three_digit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n>99 && n<1000) {
			System.out.println("Number is three digits");
		}
		else {
			System.out.println("Number is not three digits");
		}
		

	}

}