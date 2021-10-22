package level02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//해시 - 위장
public class No_16 {
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(new No_16().solution(clothes));
	}

	public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1)+1);
        }
        
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()) {
        	String key=it.next();
        	answer*=map.get(key);
        }
        return answer-1;
    }
}