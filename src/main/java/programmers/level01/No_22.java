package programmers.level01;

import java.util.ArrayList;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 * <p>
 * 연습문제 - 같은 숫자는 싫어~
 */
public class No_22 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(new No_22().solution(arr));
    }

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && (arr[i - 1] == arr[i])) {
                continue;
            }
            list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
