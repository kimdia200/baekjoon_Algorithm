package level02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//2019 카카오개발자 겨울인턴십  -  튜플
//set.add(param)를 사용해서 중복검사했음
public class No_19_important {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_19_important().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
	}
	public int[] solution(String str) {
        String[] arr = str.replace("{", " ").replace("}", " ").trim().split(" , ");
        Arrays.sort(arr,(a,b)->a.length()-b.length());
        int[] answer= new int[arr.length];
        Set<String> set = new HashSet<>();
        int idx =  0;
        System.out.println(Arrays.deepToString(arr));
        for(String s1 : arr) {
        	for(String s2 : s1.split(",")) {
        		if(set.add(s2)) answer[idx++]=Integer.parseInt(s2);
        	}
        }
        return answer;
    }
}
