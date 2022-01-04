package inflearn.step02;

import java.util.Scanner;

//보이는 학생
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(new _02().solution(arr));
	}
	
	public int solution(int[] arr) {
		int result=0;
		int min=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(min>=arr[i]) continue;
			
			min=arr[i];
			result++;
		}
		return result;
	}
}
