package Step05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//¿¿±ﬁΩ«
public class _08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(new _08().solution(n,m,arr));
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer=0;
		
		List<Integer> list = new ArrayList<>();
		List<Integer> sort = new ArrayList<>();
		for(int x : arr) {
			list.add(x);
			sort.add(x);
		}
		sort.sort(Collections.reverseOrder());
		
		int target = m;
		
		while(target>=0) {
			int get = list.remove(0);
			if(get != sort.get(0)) {
				list.add(get);
				if(target==0) target = list.size();
			}else {
				sort.remove(0);
				answer++;
			}
			target--;
		}
		return answer;
	}
}
