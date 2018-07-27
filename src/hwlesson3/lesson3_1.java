package hwlesson3;

import java.util.Scanner;

public class lesson3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число:");
		int num = sc.nextInt();
		for (int i = 0; i < (num * 2); i++) {
			if (i < num)
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			else if (i == num)
				for (int j = 0; j < num; j++) {
					System.out.print("*");
				}
			else
				for (int j = 0; j < (num - (i - num)); j++) {
					System.out.print("*");
				}
			System.out.println("");
		}
		sc.close();
	}

}
