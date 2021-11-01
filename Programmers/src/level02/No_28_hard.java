package level02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//2019 kakao blind recruitment
//https://programmers.co.kr/learn/courses/30/lessons/42890
public class No_28_hard {
	public static void main(String[] args) {
		String[][] relation = {
				{"100","ryan","music","2"},
				{"200","apeach","math","2"},
				{"300","tube","computer","3"},
				{"400","con","computer","4"},
				{"500","muzi","music","3"},
				{"600","apeach","music","2"}};
		System.out.println(new No_28_hard().solution(relation));
	}
	
	List<String> list = new ArrayList<>();
	public int solution(String[][] relation) {
        init(relation);
        List<String> result = new ArrayList<>();
        //������ ����
        outter:
        for(String s : list) {
        	boolean flag = true;
			for(String complete : result) {
				int cnt = 0;
				for(String ss : complete.split("")) {
					if(s.contains(ss)) cnt++;
				}
				if(cnt==complete.length()) {
					flag=false;
					continue outter;
				}
			}
        	Set<String> set = new HashSet<>();
        	String[] comb = s.split("");
        	//�˻�
        	for(int i=0; i<relation.length; i++) {
        		StringBuilder sb = new StringBuilder();
        		for(String c : comb) {
        			sb.append(relation[i][Integer.parseInt(c)]);
        		}
        		set.add(sb.toString());
        	}
        	if(set.size()==relation.length) {
        		result.add(s);
        	}
        }
        return result.size();
    }

	//��Ʈ��ŷ�� ���� ������ list������ �־��ش�
	private void init(String[][] relation) {
		int len = relation[0].length;
		int[] arr = new int[len];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		boolean[] visited = new boolean[arr.length];
		for(int i=1; i<=len; i++) {
			comb(arr,visited,0,i);
		}
	}

	private void comb(int[] arr, boolean[] visited,int start, int end) {
		if(end==0) {
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<arr.length; i++) {
				if(visited[i]) sb.append(arr[i]);
			}
			list.add(sb.toString());
			return;
		}
		
		for(int i=start; i<arr.length; i++) {
			visited[i] = true;
			comb(arr, visited, i+1, end-1);
			visited[i] = false;
		}
	}
}

