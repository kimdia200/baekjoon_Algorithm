package _5_Array;

import java.util.Scanner;

public class _3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 세개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("A*B*C = "+a+"*"+b+"*"+c+" = "+(a*b*c));
		
		int[] arr = new int[10];
		
		String temp = String.valueOf(a*b*c);
		
		for (int i = 0; i < temp.length(); i++) {
			arr[Integer.parseInt(String.valueOf(temp.charAt(i)))]++;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0)
				System.out.println(i+"는 "+arr[i]+"번");
		}
	}

}
