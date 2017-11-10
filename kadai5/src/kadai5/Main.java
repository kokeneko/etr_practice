package kadai5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		int a = scan1.nextInt();
		int b = scan1.nextInt();
		
		System.out.println("足し算:"+(a + b));
		System.out.println("引き算:"+(a - b));
		System.out.println("掛け算:"+(a * b));
		System.out.println("割り算:"+(a / b));

		scan1.close();
	}

}
