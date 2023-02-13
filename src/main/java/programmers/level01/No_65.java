package programmers.level01;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/135808
//코딩테스트 연습
//연습문제
//과일 장수
public class No_65 {
    public static void main(String[] args) {
        System.out.println(new No_65().solution(4,3,new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        int box = score.length/m;
        int garbage = score.length%m;

        Queue<Integer> q = new PriorityQueue<>();
        for(int i : score){
            q.add(i);
        }
        for (int i=0; i<garbage; i++){
            q.poll();
        }
        while (!q.isEmpty()){
            answer+=q.poll()*m;
            for(int i=0; i<m-1; i++){
                q.poll();
            }
        }
        return answer;
    }

    public int solution2(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }
        return answer;
    }
}
