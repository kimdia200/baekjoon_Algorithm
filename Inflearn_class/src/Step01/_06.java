package Step01;

import java.util.Scanner;

//�ߺ���������
public class _06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = "";
		for(String s : str.split("")) {
			if(!answer.contains(s)) {
				answer+=s;
			}
		}
		System.out.println(answer);
	}
}
