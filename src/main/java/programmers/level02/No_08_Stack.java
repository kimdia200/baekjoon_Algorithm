package programmers.level02;

import java.util.Stack;

//짝지어 제거하기
//https://programmers.co.kr/learn/courses/30/lessons/12973
public class No_08_Stack {
	public static void main(String[] args) {
		
		String s = "baabaa";
		System.out.println(new No_08_Stack().solution2(s));
	}
	
	//처음에 내가 푼 방법 = stack틀 활용한 solution2보다 테스트케이스에서 효율성이 300배 차이났음
	public int solution(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i=1; i<sb.length(); i++) {
        	if(sb.charAt(i-1) == sb.charAt(i)) {
        		sb.delete(i-1, i+1);
        		i=0;
        	}
        }
        if(sb.length()==0) return 1;
        return 0;
    }
	
	//stack을 활용하여 O(n)으로 풀수있었다...
	public int solution2(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(!stack.isEmpty() && stack.peek()==c) stack.pop();
			else stack.push(c);
		}
		return stack.isEmpty() ? 1:0;
	}
}
