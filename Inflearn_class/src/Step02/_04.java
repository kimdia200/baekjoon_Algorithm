package Step02;

//피보나치 수열
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		solution2(sc.nextInt());
	}
	
	public static void solution(int n) {
		int[] arr = new int[n];
		if(arr.length>0) arr[0] = 1;
		if(arr.length>1) arr[1] = 1;
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) System.out.print(" ");
		}
	}
	
	public static void solution2(int n) {
		int a=1;
		int b=1;
		int c;
		if(n>0) System.out.print(a);
		if(n>1) System.out.print(" "+b);
		for(int i=2; i<n; i++) {
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
