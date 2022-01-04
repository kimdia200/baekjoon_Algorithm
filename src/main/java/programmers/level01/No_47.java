package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 * 
 * 월간 코드 챌린지 - 두개 뽑아 더하기
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class No_47 {
	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		System.out.println(Arrays.toString(new No_47().solution(numbers)));
	}

	public int[] solution(int[] numbers) {
		int[] answer = null;

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}

		Iterator<Integer> it = set.iterator();
		answer = new int[set.size()];
		int i = 0;
		while (it.hasNext()) {
			answer[i++] = it.next();
		}

		return answer;
	}
}
