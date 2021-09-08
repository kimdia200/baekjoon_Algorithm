package Step01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//특정문자 뒤집기, 특수문자는 놔두고
//input : a#b!GE*T@S
//output : S#T!EG*b@a

public class _05 {
	public static void main(String[] args) {
		solution2();
	}
	
	//강사님이 풀이한것
	public static void solution2() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		int lt = 0;
		int rt = arr.length-1;
		
		while(lt<rt) {
			if(!Character.isAlphabetic(arr[lt])) lt++;
			else if(!Character.isAlphabetic(arr[rt])) rt--;
			else {
				char temp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = temp;
				lt++;
				rt--;
			}
		}
		for(char c : arr) {
			System.out.print(c);
		}
	}
	
	
	//내가 풀이한것
	public static void solution1() {
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
