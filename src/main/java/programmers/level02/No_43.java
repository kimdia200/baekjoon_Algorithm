package programmers.level02;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909
//�ùٸ� ��ȣ


//String.split("") ���� �����ϱ� ��ȿ���׽�Ʈ���� �ð��ʰ� �߻�
//String.toCharArray() ����ϴϱ� �ð� �����
public class No_43 {
    public static void main(String[] args) {
        System.out.println(new No_43().solution("(())()"));
    }
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(stack.isEmpty()){
                if(c=='(') stack.push(c);
                else return false;
            }else{
                if(c=='(') stack.push(c);
                else if(c==')' && stack.peek()=='(') stack.pop();
                else return false;
            }
        }
        return stack.size() == 0;
    }
}
