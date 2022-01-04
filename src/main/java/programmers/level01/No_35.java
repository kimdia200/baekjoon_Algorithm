package programmers.level01;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 *
 * 연습문제 - 제일 작은 수 제거하기
 */
public class No_35 {
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(new No_35().solution(arr));
	}
	public int[] solution(int[] arr) {
		int[] answer = {-1};
		if(arr.length==1) {
			return answer;
		}
        answer = new int[arr.length-1];
        
        int min = arr[0];
        
        for(int i=1; i<arr.length; i++) {
        	if(min>=arr[i]) min = arr[i];
        }
        
        int idx = 0;
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i] != min) answer[idx++] = arr[i];
        }
        
        return answer;
    }
}
