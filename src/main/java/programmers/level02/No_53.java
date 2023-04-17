package programmers.level02;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/131701
//코딩테스트 연습 연습문제 연속 부분 수열 합의 개수
//sliding window를 쓰면 쉽게 풀 수 있다.
public class No_53 {
    public static void main(String[] args) {
        System.out.println("\n"+new No_53().solution(new int[]{1,2,3,4,5,6}));
    }
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=elements.length; i++){
            int sum = 0;
            for(int j=0; j<i; j++){
                sum+=elements[j];
            }
            set.add(sum);
            for(int lt=0; lt<elements.length-1; lt++){
                 int rt = (i+lt)%elements.length;
                sum=sum-elements[lt]+elements[rt];
                set.add(sum);
            }
        }
        return set.size();
    }
}
