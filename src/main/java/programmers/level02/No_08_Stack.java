package programmers.level02;

import java.util.Stack;

//¦���� �����ϱ�
//https://programmers.co.kr/learn/courses/30/lessons/12973
public class No_08_Stack {
	public static void main(String[] args) {
		
		String s = "baabaa";
		System.out.println(new No_08_Stack().solution2(s));
	}
	
	//ó���� ���� Ǭ ��� = stackƲ Ȱ���� solution2���� �׽�Ʈ���̽����� ȿ������ 300�� ���̳���
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
	
	//stack�� Ȱ���Ͽ� O(n)���� Ǯ���־���...
	public int solution2(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(!stack.isEmpty() && stack.peek()==c) stack.pop();
			else stack.push(c);
		}
		return stack.isEmpty() ? 1:0;
	}
}
