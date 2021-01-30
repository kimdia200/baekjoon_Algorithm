package _9_Math2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int num;
		while(true) {
			num=sc.nextInt();
			if(num==0)
				break;
			list.add(num);
		}
		for(int x : list)
			new _5().test(x);
	}
	
	public void test(int num) {
	
		int[] arr = new int[num*2 - num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num+1 + i;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean notFound = true;
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					notFound = false;
					break;
				}
			}
			if (arr[i] == 1)
				notFound = false;
			if (notFound || arr[i] == 2) {
				count++;
			}
		}
		System.out.println(count);
	}
}
