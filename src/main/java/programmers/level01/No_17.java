package programmers.level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/12977
 * 
 * Summer/Winter Coding(~2018) 소수만들기
 * 
 * 다른사람들도 비슷한 방식으로 푼거같음!
 *
 */
public class No_17 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(new No_17().solution(arr));
	}
	
	public int solution(int[] nums) {
        int answer = 0;
        
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			int n = nums[i]+nums[j]+nums[k];
        			boolean notSosu = true;
        			for(int x=2; x<n;x++) {
        				if(n%x==0) {
        					notSosu = false;
        					break;
        				}
        			}
        			if(notSosu) {
        				answer++;
        			}
        		}
        	}
        }
        return answer;
    }
}
