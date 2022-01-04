package programmers.level02;

import java.util.Stack;

//탐욕법 - 큰수만들기
//https://programmers.co.kr/learn/courses/30/lessons/42883
public class No_29_important {
	public static void main(String[] args) {
		System.out.println(new No_29_important().solution("4177252841", 4));
	}
	
	//stack을 활욜한 방법 굉장히 잘짠 코드이다.
	public String solution(String number, int k) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<number.length(); i++) {
			char c = number.charAt(i);
			while(!stack.isEmpty() && stack.peek()<c && k-->0) {
				stack.pop();
			}
			stack.push(c);
		}
		
		for(int i=0; i<stack.size(); i++) {
			sb.append(stack.get(i));
		}
		return sb.toString();
    }
	
	
	int start = 0;
	public String solution2(String number, int k) {
		String[] arr = number.split("");
		boolean[] bool = new boolean[arr.length];
		StringBuilder sb = new StringBuilder();
		int loop=number.length()-k;
		while(loop>0) {
			sb.append(findOne(arr,bool,loop--));
		}
		return sb.toString();
    }

	private String findOne(String[] arr, boolean[] bool, int k) {
		int[] nums = {9,8,7,6,5,4,3,2,1,0};
		String answer=null;
		outter:
		for(int num : nums) {
			for(int i=start; i<=arr.length-k; i++) {
				if(Integer.parseInt(arr[i])==num && bool[i]==false) {
					bool[i]=true;
					answer=arr[i];
					start = i+1;
					break outter;
				}
			}
		}
		return answer;
	}
}
