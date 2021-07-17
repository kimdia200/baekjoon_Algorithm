package level01;
/**
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 * 
 * 그리디 알고리즘 문제
 *
 */
public class No_05 {
	public static void main(String[] args) {
		No_05 nn = new No_05();
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		System.out.println(nn.solution(n, lost, reserve));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] arr = new int[n];
        
        for(int x : lost) {
        	arr[x-1]--;
        }
        
        for(int x : reserve) {
        	arr[x-1]++;
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]>=0) continue;
        	
        	if(i!=0 && arr[i-1]==1) {
        		arr[i-1]--;
        		arr[i]++;
        	}else if(i!=arr.length-1 && arr[i+1]==1) {
        		arr[i+1]--;
        		arr[i]++;
        	}
        }
        
        for(int x : arr) {
        	if(x>=0)
        		answer++;
        }
        return answer;
    }
}
