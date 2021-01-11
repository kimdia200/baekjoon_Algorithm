package _6_Method;

import java.util.HashSet;
import java.util.Set;

/**
 * URL: https://www.acmicpc.net/problem/4673
 *
 */
public class _2 {
	public static void main(String[] args) {
		_2 t = new _2();
		t.Kaprekar();
	}
	
	public void Kaprekar() {
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i=0; i<=10000; i++)
			set1.add(i);
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j <= i; j++) {
				String temp = String.valueOf(j);
				int sum = 0;
				for(int k=0; k<temp.length(); k++) {
					sum += Integer.parseInt(String.valueOf(temp.charAt(k)));
				}
				sum+=j;
				if(sum==i) {
					set2.add(sum);
					break;
				}else if(sum>10000) {
					break;
				}
			}
		}
		set1.removeAll(set2);
		set1.remove(0);
		System.out.println(set1);
	}
}
