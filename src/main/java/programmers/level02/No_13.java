package programmers.level02;

import java.util.ArrayList;
import java.util.List;

//Å½¿å¹ý(greedy) Á¶ÀÌ½ºÆ½
public class No_13 {
	public static void main(String[] args) {
		String name = "JEROEN";//"JEROEN";
		System.out.println(new No_13().solution(name));
	}
	
	private int lr = Integer.MAX_VALUE;
	public int solution(String name) {
		//¿òÁ÷ÀÎ È½¼ö
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        //À§¾Æ·¡ È½¼ö ±¸ÇÔ
        for(int i=0; i<name.length(); i++) {
        	answer+=ud(i,name);
        	if(i!=0 && name.charAt(i)!='A') list.add(i);
        }
        
        
        //ÁÂ¿ìÀÌµ¿ È½¼ö
        List<Integer> result = new ArrayList<>();
        recur(list,result,name);
        answer+=lr;
        return answer;
    }
	public int ud(int idx, String name) {
		return Math.min(name.charAt(idx)-'A', 'A'-name.charAt(idx)+26);
	}
	private void recur(List<Integer> list, List<Integer> result, String name) {
		if(list.size()==0) {
			result.add(0,0);
			int cnt = distance(result,name);
			if(lr>cnt) lr = cnt;
			result.remove(0);
			return;
		}
		for(int i=0; i<list.size(); i++) {
			result.add(list.remove(i));
			recur(list,result,name);
			list.add(i,result.remove(result.size()-1));
		}
	}
	private int distance(List<Integer> result, String name) {
		int cnt = 0;
		for(int i=1; i<result.size(); i++) {
			int big = Math.max(result.get(i), result.get(i-1));
			int small = Math.min(result.get(i), result.get(i-1));
			cnt+=Math.min(big-small, name.length()-big+small);
		}
		return cnt;
	}
}
