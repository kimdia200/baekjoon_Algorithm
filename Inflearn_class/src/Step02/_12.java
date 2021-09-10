package Step02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//∏‡≈‰∏µ
public class _12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int memberCnt = sc.nextInt();
		int testCnt = sc.nextInt();
		int[][] arr = new int[testCnt][memberCnt];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(new _12().solution(arr));
	}
	
	public int solution(int[][] arr) {
		List<String> list = new ArrayList<>();
		
		for(int i=1; i<=arr[0].length; i++) {
			for(int j=1; j<=arr[0].length; j++) {
				if(i==j) continue;
				list.add(i+","+j);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<j; k++) {
					list.remove(arr[i][j]+","+arr[i][k]);
				}
			}
		}
		return list.size();
	}
}
