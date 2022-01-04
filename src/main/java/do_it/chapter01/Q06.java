package do_it.chapter01;

import java.util.Scanner;

//P.29
//While문이 종료될때 변수 i값이 n+1이 됨을 확인하라
public class Q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int i=1;
		int n = sc.nextInt();
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println(i);
	}
}
