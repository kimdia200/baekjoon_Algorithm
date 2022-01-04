package inflearn.step06;

import java.util.Arrays;
import java.util.Scanner;

//뮤직비디오(결정알고리즘)
//요구하는 정답이 lt ~ rt사이에 있다고 확신이 들경우 결정알고리즘 사용
public class _09_Binary_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		System.out.println(solution(arr,n,m));
	}

	private static int solution(int[] arr, int n, int m) {
		int answer = 0;
		//최소용량은 가장큰값
		//최대욜량은 한장에 담았을 경우 가정
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)<=m) {
				answer = mid;
				rt=mid-1;
			}else {
				lt = mid+1;
			}
		}
		return answer;
	}
	
	//해당용량으로 하면 cd가 몇장나오나?
	public static int count(int[]arr , int capacity) {
		int cnt=1, sum=0;
		for(int x: arr) {
			if(sum+x<=capacity) sum+=x;
			else {
				cnt++;
				sum=x;
			}
		}
		return cnt;
	}
}
