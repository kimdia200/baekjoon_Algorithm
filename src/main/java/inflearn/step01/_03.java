package inflearn.step01;

import java.util.Scanner;
//문장속 단어
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(new _03().solution(line));
	}
	
	public String solution(String line) {
		String[] arr = line.split(" ");
		int idx = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[idx].length()<arr[i].length())
				idx = i;
		}
		return arr[idx];
	}
}
