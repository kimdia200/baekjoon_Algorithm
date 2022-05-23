package inflearn.step09;

import java.util.*;

/**
 * Greedy �˰����� ����ϸ鼭 �������� �����ϴ� �ð����� ��Ҵ��� ����� ������ �� ����� ������.
 * �׷��� ������ �ð��� �������� ������ �ϴ� ������ �� �� �־���.
 * Greedy �˰��� ���� ����ڰ� ������ �� ���ؾ� ������ Ǯ���°��� �� �� �־���.
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