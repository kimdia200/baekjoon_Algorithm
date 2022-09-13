package programmers.level02;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909
//올바른 괄호


//String.split("") 으로 나누니까 유효성테스트에서 시간초과 발생
//String.toCharArray() 사용하니까 시간 통과함
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
