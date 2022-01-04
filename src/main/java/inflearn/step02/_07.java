package inflearn.step02;

import java.util.Scanner;

//점수계산
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		int bonus = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			switch (arr[i]) {
			case 1:
				bonus++;
				sum+=bonus;
				break;
			case 0:
				bonus=0;
				break;
			}
		}
		
		System.out.println(sum);
	}
}
