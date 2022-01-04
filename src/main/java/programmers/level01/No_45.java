package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 *
 * 연습문제 - 최대공약수와 최소공배수
 */
public class No_45 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_45().solution(3,12)));
	}
	
	// 다른사람이 푼것 대박....
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];
		return answer;
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		return gcd(q, p % q);
	}
	
	
	//내가푼거
	public int[] solution(int n, int m) {
		if(n==m) {
			return new int[] {n,n};
		}
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=1; i<=n/2; i++) {
			if(n%i == 0) {
				list1.add(i);
				list1.add(n/i);
			}
		}
		for(int i=1; i<=m/2; i++) {
			if(m%i == 0) {
				list2.add(i);
				list2.add(m/i);
			}
		}
		
		list1.sort(null);
		
		int gcd=1;
		for(int x : list1) {
			if(list2.contains(x)) {
				gcd=x;
			}
		}
		
		int small;
		int big;
		if(n<m) {
			small=n;
			big=m;
		}else {
			small=m;
			big=n;
		}
		
		int lcm=big;
		for(int i=2;;i++) {
			if(lcm%small==0) {
				break;
			}else {
				lcm=big*i;
			}
		}
		return new int[] {gcd, lcm};
    }
}
