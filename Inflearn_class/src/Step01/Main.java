package Step01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Ư������ ������, Ư�����ڴ� ���ΰ�
//input : a#b!GE*T@S
//output : S#T!EG*b@a

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.nextLine().toCharArray();
		List<Character> list = new ArrayList<>();
		for(char c : arr) {
			if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
				list.add(c);
			}
		}
		Collections.reverse(list);
		for(int i=0; i<arr.length; i++) {
			if(!((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z'))) {
				list.add(i,arr[i]);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char c : list) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
	}
}
