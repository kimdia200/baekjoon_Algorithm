package baek_jun._5_Array;

import java.util.Scanner;

/**
 * url : https://www.acmicpc.net/problem/2562
 * @author family
 *
 */
public class _2 {
		
		public static void main(String[] args) {
			int[] arr = new int[9];
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("�ڿ��� �Է� : ");
				arr[i] =sc.nextInt(); 
			}
			int max = arr[0];
			int idx = 0;
			for(int i=0; i<arr.length; i++) {
				if(max<=arr[i]) {
					max=arr[i];
					idx=i;
				}
			}
			
			System.out.println("�ִ� : "+max+"�� "+(idx+1)+"��° ���Դϴ�.");
		}
		
}
