package skillCheck.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No_01 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_01().solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
	}
	
	public int[] solution(String s) {
        
        List<String> list = new ArrayList<>();
        
        for(String str : s.split("},")) {
        	list.add(str.replaceAll("[{}]", ""));
        }
        list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
        int[] answer = new int[list.size()];
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<list.size(); i++) {
        	String[] temp = list.get(i).split(",");
        	for(int j=0; j<temp.length; j++) {
        		if(set.add(temp[j])) {
        			answer[i] = Integer.parseInt(temp[j]);
        			break;
        		}
        	}
        }
        return answer;
    }
}
