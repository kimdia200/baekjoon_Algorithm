package programmers.level02;

import java.util.ArrayList;
import java.util.List;

public class No_21 {
	public static void main(String[] args) {
		int k=80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		System.out.println(new No_21().solution(k, dungeons));
	}
	public static int max=0;
	public int solution(int k, int[][] dungeons) {
        List<int[]> base = new ArrayList<int[]>(); 
        for(int[] x : dungeons) {
        	base.add(x);
        }
        List<int[]> temp = new ArrayList<int[]>();
        recur(base,temp,k);
        return max;
    }
	private void recur(List<int[]> base, List<int[]> temp,int k) {
		if(base.isEmpty()) {
			int cnt=0;
			for(int[] x : temp) {
				if(k-x[0]>=0) {
					cnt++;
					k-=x[1];
				}else break;
			}
			max=Math.max(max, cnt);
		}
		for(int i=0; i<base.size();i++) {
			temp.add(base.remove(i));
			recur(base, temp, k);
			base.add(i,temp.remove(temp.size()-1));
		}
	}
}
