import java.util.Scanner;
public class ReadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("The number entered is: "+num);
	}
}
