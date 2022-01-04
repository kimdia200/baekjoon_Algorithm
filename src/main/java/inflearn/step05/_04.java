package inflearn.step05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//후위식 연산(postfix)
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(new _04().solution(str));
	}

	private int solution(String str) {
		List<Integer> list = new ArrayList<>();
		for(char c : str.toCharArray()) {
			int num;
			switch (c) {
			case '+': 
				num=list.remove(list.size()-2) + list.remove(list.size()-1);
				break;
			case '-': 
				num=list.remove(list.size()-2) - list.remove(list.size()-1);
				break;
			case '*': 
				num=list.remove(list.size()-2) * list.remove(list.size()-1);
				break;
			case '/': 
				num=list.remove(list.size()-2) / list.remove(list.size()-1);
				break;
			default : 
				num=Integer.parseInt(String.valueOf(c));
			}
			list.add(num);
		}
		return list.get(0);
	}
}
