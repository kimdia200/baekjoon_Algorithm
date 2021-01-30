package _9_Math2;

import java.util.Scanner;

public class _4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numF = sc.nextInt();
		int numB = sc.nextInt();
		for (int i = numF; i <= numB; i++) {
			if (i == 1 || i == 0)
				continue;
			boolean notFound = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					notFound = false;
				}
			}
			if (notFound || i == 2) {
				System.out.println(i);
			}
		}
	}
}
