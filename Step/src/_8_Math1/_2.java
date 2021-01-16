package _8_Math1;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i=1;
		int sum=1;
		while(true) {
			int temp=6*i;
			sum+=temp;
			if(num<sum)
				break;
			i++;
		}
		System.out.println(i+1);
	}
}
