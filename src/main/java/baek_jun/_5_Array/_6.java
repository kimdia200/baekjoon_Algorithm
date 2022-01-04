package baek_jun._5_Array;

import java.util.Scanner;

/**
 * URL : https://www.acmicpc.net/problem/8958
 *
 */

public class _6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int num=sc.nextInt();
		while(i<num) {
			int j=0;
			int sum=0;
			char[] temp = sc.next().toCharArray();
			for (int k = 0; k < temp.length; k++) {
				if(temp[k]=='X') {
					j=0;
					continue;
				}
				if(k==0)
					sum+= ++j;
				else if(temp[k]=='O')
					sum+= ++j;
			}
			i++;
			System.out.println(sum);
		}
	}
}
