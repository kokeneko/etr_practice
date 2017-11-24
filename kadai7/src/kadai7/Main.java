package kadai7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int num;

		for(int i = 0;i < 10;i++) {
			num = scan.nextInt();
				switch(num){
				case 0: a[0]++; break;
				case 1: a[1]++; break;
				case 2: a[2]++; break;
				case 3: a[3]++; break;
				case 4: a[4]++; break;
				case 5: a[5]++; break;
				case 6: a[6]++; break;
				case 7: a[7]++; break;
				case 8: a[8]++; break;
				case 9: a[9]++; break;
				}
		}
		for(int i = 0;i < 10;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
