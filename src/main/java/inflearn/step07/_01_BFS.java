package inflearn.step07;

import java.util.*;

public class _01_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();


        int answer = -1;
        int[] move = {-1,1,5};
        //��ġ, ���������� ī��Ʈ
        Map<Integer, Integer> visit = new HashMap<>();
        visit.put(s,0);

        //���� ��ġ
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int now = q.poll();
            if(now==e){
                answer = visit.get(now);
                break;
            }
            for(int x : move){
                int next = now + x;
                if(!visit.containsKey(next)){
                    q.add(next);
                    visit.put(next, visit.get(now)+1);
                }
            }
        }
        System.out.println(answer);
    }
}
