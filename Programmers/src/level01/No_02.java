package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//문제 : 완주하지 못한 선수
//url : https://programmers.co.kr/learn/courses/30/lessons/42576



public class No_02 {
	public static void main(String[] args) {
		No_02 t = new No_02();
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(t.solution3(participant, completion));
	}
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		//asList = 추상클래스 List타입으로 리턴해서 ArrayList로 변환해줘야함...
		List<String> list1 = new ArrayList<>(Arrays.asList(participant));
		List<String> list2 = new ArrayList<>(Arrays.asList(completion));
		
		
		Iterator<String> it = list2.iterator();
		while(it.hasNext()) {
			String s = it.next();
			list1.remove(list1.indexOf(s));
		}
		answer=list1.get(0);
		return answer;
	}
	
	public String solution2(String[] participant, String[] completion) {
		String answer="";
		
		List<String> list = new ArrayList<String>(Arrays.asList(participant));
		
		for(String s : completion) {
			list.remove(s);
		}
		answer = list.get(0);
		return answer;
	}
	
	//제일 베스트 답안( 코드 실행 시간이 제일 효율적임 )
	public String solution3(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : participant) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(String s : completion) {
			map.put(s, map.get(s)-1);
		}
		
		for(String s : map.keySet()) {
			if(map.get(s)!=0) {
				answer=s;
				break;
			}
		}
		return answer;
	}
}
