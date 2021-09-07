package Step01;

import java.util.Scanner;
//문자열 뒤집기
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(sc.nextLine());
			System.out.println(sb.reverse().toString());
		}
	}
}
