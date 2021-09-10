package Step02;

import java.util.Scanner;

//뒤집은소수

public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(sc.next());
			arr[i] = Integer.parseInt(sb.reverse().toString());
		}
		
		outter:
		for(int x : arr) {
			if(x<2) continue;
			for(int i=2; i<=Math.sqrt(x); i++) {
				if(x%i==0) continue outter;
			}
			System.out.print(x+" ");
		}
	}
}
