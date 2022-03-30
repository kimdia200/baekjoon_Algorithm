package programmers.level02;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//코딩테스트 연습 - 깊이/너비 우선탐색(DFS/BFS) - 타겟넘버
//https://programmers.co.kr/learn/courses/30/lessons/43165
//경우의수 구하는 문제니까 DFS로 풀이해야한다고 생각함
public class No_35 {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(new No_35().solution(numbers,target));
    }

    //DFS를 풀때는 재귀를 간단하게 구현해서 작업하는게 효율이 훨씬 좋다...
    public int solution(int[] numbers, int target) {
        int idx=0;
        int sum=0;
        return dfs(numbers,idx,sum,target);
    }

    public int dfs(int[] numbers, int idx, int sum, int target){
        if(idx==numbers.length){
            if(sum==target)
                return 1;
            else
                return 0;
        }
        return dfs(numbers, idx+1,sum+numbers[idx],target)+dfs(numbers,idx+1,sum-numbers[idx],target);
    }


    //작동시간이 너무 오래 걸림...
    public int solution2(int[] numbers, int target) {
        int answer = 0;

        Queue<Integer> result = new LinkedList<>();
        result.offer(0);
        for(int i : numbers){
            Queue<Integer> now = new LinkedList<>();
            while(!result.isEmpty()){
                int n = result.poll();
                now.offer(n+i);
                now.offer(n-i);
            }
            result=now;
        }
        for(int i : result){
            if(i==target) answer++;
        }
        return answer;
    }
}
