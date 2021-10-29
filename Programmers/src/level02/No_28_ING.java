package level02;

import java.util.HashSet;
import java.util.Set;

//2019 kakao blind recruitment
//https://programmers.co.kr/learn/courses/30/lessons/42890
public class No_28_ING {
	public static void main(String[] args) {
		String[][] relation = {
				{"100","ryan","music","2"},
				{"200","apeach","math","2"},
				{"300","tube","computer","3"},
				{"400","con","computer","4"},
				{"500","muzi","music","3"},
				{"600","apeach","music","2"}};
		System.out.println(new No_28_ING().solution(relation));
	}
	
	public int solution(String[][] relation) {
        int answer = 0;
        
        int row = relation.length;
        int column = relation[0].length;
        
        Set<String> set;
        for(int i=0; i<column; i++) {
        	set = new HashSet<String>();
        	for(int j=0; j<row; j++) {
        		if(!set.add(relation[j][i])) {
        			break;
        		}
        	}
        	if(relation.length==set.size()) answer++;
        }
        
        return answer;
    }
}

