package programmers.level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//문제 : 두개 뽑아 더하기
//url : https://programmers.co.kr/learn/courses/30/lessons/68644
public class No_01 {

	public static void main(String[] args) {
		int[] a = {5,0,2,7};
		
		System.out.println(Arrays.toString(new No_01().solution(a)));
	}
	
	public int[] solution(int[] numbers) {
		int[] answer = null;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		
		Iterator<Integer> it = set.iterator();
		answer = new int[set.size()];
		int i=0;
		while(it.hasNext()) {
			answer[i++] = it.next();
		}
		
		return answer;
	}

}
