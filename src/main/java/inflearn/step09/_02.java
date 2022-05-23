package inflearn.step09;

import java.util.*;

/**
 * Greedy 알고리즘을 사용하면서 기준점을 시작하는 시간으로 잡았더니 제대로 구현을 할 방법이 없었다.
 * 그러나 끝나는 시간을 기준으로 정렬을 하니 구현을 할 수 있었다.
 * Greedy 알고리즘 사용시 사용자가 기준을 잘 정해야 문제가 풀리는것을 알 수 있었다.
 */
public class _02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Meet> set = new TreeSet<>();
        for(int i=0; i<n; i++){
            set.add(new Meet(sc.nextInt(), sc.nextInt()));
        }
        int cnt = 0;
        int end = 0;
        for(Meet m : set){
            if(end>m.start) continue;
            cnt++;
            end = m.end;
        }
        System.out.println(cnt);
    }
}

class Meet implements Comparable<Meet>{
    int start;
    int end;
    public Meet(int start, int end){
        this.start=start;
        this.end=end;
    }
    @Override
    public int compareTo(Meet o) {
        if(this.end!=o.end){
            return this.end-o.end;
        }else{
            return this.start-o.start;
        }
    }
    @Override
    public String toString() {
        return start + " " + end;
    }
}