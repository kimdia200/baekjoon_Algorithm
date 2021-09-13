package Step05;

import java.util.Scanner;

//¿Ã¹Ù¸¥ °ýÈ£
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(new _01().solution(str));
	}

	private String solution(String str) {
		String answer = "YES";
		
		int lt=0, rt=0;
		
		for(char c : str.toCharArray()) {
			if(c=='(') lt++;
			else if(c==')') rt++;
			if(lt<rt) return "NO";
		}
		if(lt!=rt) return "NO";
		
		return answer;
	}
}
