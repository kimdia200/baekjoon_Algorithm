package programmers.level02;

import java.util.*;

public class No_50 {
    public static void main(String[] args) {
        System.out.println(new No_50().solution(6,new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }

    public int solution(int k, int[] tangerine) {
        int answer=0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Queue<Integer> q = new PriorityQueue<>((i,j) -> j-i);
        q.addAll(map.values());
        System.out.println(q);
        int sum = 0;
        while(sum<k && !q.isEmpty()){
            sum+=q.poll();
            answer++;
        }
        return answer;
    }
}
