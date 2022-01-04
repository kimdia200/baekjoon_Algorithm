package baek_jun._5_Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * URL:https://www.acmicpc.net/problem/3052
 *
 */
public class _4 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			set.add(sc.nextInt()%42);
		}
		System.out.println(set.size());
	}
}
