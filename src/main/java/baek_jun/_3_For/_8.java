package baek_jun._3_For;

import java.util.Scanner;

public class _8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a, b;
		int temp;
		temp = sc.nextInt();
		
		a = new int[temp];
		b = new int[temp];
		
		for(int i=0; i<temp; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for(int i=0; i<temp; i++) {
			System.out.println("Case #"+(i+1)+": "+a[i] +" + "+b[i]+" = "+(a[i]+b[i]));
		}
		
		
	}
}
