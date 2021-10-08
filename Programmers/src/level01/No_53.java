package level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//최소직사각형
public class No_53 {
	public static void main(String[] args) {
		int[][] arr = {
				{10,7},
				{12,3},
				{8,15},
				{14,7},
				{7,11}};
		
		System.out.println(new No_53().solution(arr));
	}

	public int solution(int[][] arr) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			int big = Math.max(arr[i][0], arr[i][1]);
			int small = Math.min(arr[i][0], arr[i][1]);
			
			a.add(big);
			b.add(small);
		}
		a.sort(Collections.reverseOrder());
		b.sort(Collections.reverseOrder());
		return a.get(0)*b.get(0);
	}
}
