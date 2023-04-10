package programmers.level01;

/**
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/70128
 * 
 * 내적
 * 
 * 아 이건 뭐야...
 *
 */
public class No_07 {
	public static void main(String[] args) {
		No_07 n = new No_07();
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {-3,-1,0,2};
		
		System.out.println(n.solution(arr1, arr2));
	}
	
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        int len = a.length;
        
        for(int i=0; i<len; i++) {
        	answer+=a[i]*b[i];
        }
        
        return answer;
    }
}
