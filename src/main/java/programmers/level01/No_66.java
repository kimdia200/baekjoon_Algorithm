package programmers.level01;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/138477
//코딩테스트 연습
//연습문제
//명예의 전당 (1)
public class No_66 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No_66().solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        Queue<Integer> q = new PriorityQueue<>();
        for(int i=0; i<score.length; i++){
            q.add(score[i]);
            if(q.size()>k){
                q.poll();
            }
            answer[i]=q.peek();
        }
        return answer;
    }
}
