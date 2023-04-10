package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 * K번째수
 * @author kimYS
 *
 */
public class No_04 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		No_04 n = new No_04();
		int[] result = n.solution(array, commands);
		System.out.println(Arrays.toString(result));
	}
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<Integer>();
        
        for(int[] command : commands) {
        	List<Integer> arrayList = new ArrayList<Integer>();
        	int start = command[0]-1;
        	int end = command[1];
        	int num = command[2];
        	System.out.println("start = "+start + "end = "+end+"num = "+num);
        	
        	for(;start<end;start++) {
        		arrayList.add(array[start]);
        	}
        	arrayList.sort(null);
        	answerList.add(arrayList.get(num-1));
        }
        answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = answerList.get(i);
        }
        return answer;
    }
}
