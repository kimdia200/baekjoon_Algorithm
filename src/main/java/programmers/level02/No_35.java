package programmers.level02;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//�ڵ��׽�Ʈ ���� - ����/�ʺ� �켱Ž��(DFS/BFS) - Ÿ�ٳѹ�
//https://programmers.co.kr/learn/courses/30/lessons/43165
//����Ǽ� ���ϴ� �����ϱ� DFS�� Ǯ���ؾ��Ѵٰ� ������
public class No_35 {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(new No_35().solution(numbers,target));
    }

    //DFS�� Ǯ���� ��͸� �����ϰ� �����ؼ� �۾��ϴ°� ȿ���� �ξ� ����...
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


    //�۵��ð��� �ʹ� ���� �ɸ�...
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
