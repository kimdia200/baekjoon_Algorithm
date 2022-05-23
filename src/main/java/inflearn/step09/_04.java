package inflearn.step09;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Schedule> q = new PriorityQueue<Schedule>();
        for(int i=0; i<n; i++){
            q.add(new Schedule(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(sol(q));
    }

    private static int sol(PriorityQueue<Schedule> q) {
        int sum = 0;
        if(q.isEmpty()) return sum;
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(q);
        while(!q.isEmpty()){
            Schedule now = q.poll();
            for(int i=now.limit; i>0; i--){
                if(!map.containsKey(i)) {
                    map.put(i,now.pay);
                    break;
                }
            }
        }
        for(int key : map.keySet()){
            sum+=map.get(key);
        }
        return sum;
    }
}

class Schedule implements Comparable<Schedule>{
    int pay;
    int limit;

    public Schedule(int pay, int limit){
        this.pay = pay;
        this.limit = limit;
    }

    @Override
    public int compareTo(Schedule o) {
        if(this.pay!=o.pay){
            return o.pay-this.pay;
        }else{
            return o.limit-this.limit;
        }
    }

    @Override
    public String toString() {
        return this.pay + " " + this.limit;
    }
}