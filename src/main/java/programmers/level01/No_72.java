package programmers.level01;

import java.util.Stack;
//https://school.programmers.co.kr/learn/courses/30/lessons/133502
//코딩테스트 연습
//연습문제
//햄버거 만들기
public class No_72 {
    public static void main(String[] args) {
        System.out.println(new No_72().solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }

    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i:ingredient){
            stack.add(i);
            if(i==1 && stack.size()>=4){
                if(stack.get(stack.size()-4)==1 && stack.get(stack.size()-3)==2 && stack.get(stack.size()-2)==3 && stack.get(stack.size()-1)==1){
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
