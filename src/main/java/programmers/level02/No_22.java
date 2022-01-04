package programmers.level02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//완전탐색 - 소수찾기
public class No_22 {
	public static void main(String[] args) {
		System.out.println(new No_22().solution("011"));
	}
	public int solution(String numbers) {
		int answer = 0;
        List<Character> base = new ArrayList<>();
        for(char c : numbers.toCharArray()) {
        	base.add(c);
        }
        List<Character> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        recur(base,result,set);
        for(int i : set) {
        	if(check(i)) answer++;
        }
        return answer;
    }
	
	private void recur(List<Character> base, List<Character> result, Set<Integer> set) {
		if(base.size()==0) {
			StringBuilder sb = new StringBuilder();
			for(char c : result) sb.append(c);
			String str = sb.toString().replace(" " , "");
			if(str.length()!=0) set.add(Integer.parseInt(str));
			return;
		}
		
		for(int i=0; i<base.size(); i++) {
			char c = base.get(i);
			result.add(base.remove(i));
			recur(base, result,set);
			result.remove(result.size()-1);
			result.add(' ');
			recur(base,result,set);
			result.remove(result.size()-1);
			base.add(i,c);
		}
	}

	public boolean check(int n) {
		if(n<=1) return false;
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
