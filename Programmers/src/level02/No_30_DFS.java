package level02;

import java.util.ArrayList;
import java.util.List;

//위클리 챌린지 - 모음사전
//https://programmers.co.kr/learn/courses/30/lessons/84512
public class No_30_DFS {
	public static void main(String[] args) {
		System.out.println(new No_30_DFS().solution("AAAAE"));
	}
    void dfs(List<String> list, String str, int len) {
        if(len > 5) return;
        list.add(str);
        for(int i = 0; i < 5; i++) dfs(list, str + "AEIOU".charAt(i), len + 1);
    }
    public int solution(String word) {
    	List<String> list = new ArrayList<>();
        dfs(list,"", 0);
        return list.indexOf(word);
    }
    
    
    
    //내가푼것....
	public int solution2(String word) {
        List<String> doc = new ArrayList<>();
        docInit(doc);
        doc.sort(null);
        return doc.indexOf(word)+1;
	}
	private void docInit(List<String> doc) {
		List<String> base =  new ArrayList<>();
		List<String> temp = new ArrayList<>();
		base.add("A");
		base.add("E");
		base.add("I");
		base.add("O");
		base.add("U");
		for(int i=1; i<=5; i++) {
			recur(base, temp, doc, i);
		}
	}
	private void recur(List<String> base, List<String> temp, List<String> doc, int end) {
		if(end==0) {
			StringBuilder sb = new StringBuilder();
			for(String s : temp) {
				sb.append(s);
			}
			doc.add(sb.toString());
			return;
		}
		for(int i=0; i<base.size(); i++) {
			temp.add(base.get(i));
			recur(base, temp, doc, end-1);
			temp.remove(temp.size()-1);
		}
	}
}
