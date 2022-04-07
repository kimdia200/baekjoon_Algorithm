package inflearn.step06;

import java.util.Arrays;
import java.util.Scanner;


//마구간정하기
//가장 가까운 두 말의 최대 거리를 구하시오 = 최소 간격으로 유효한 조합을 찾아 최소간격을 출력하면 된다.
public class _10_Binary_Search_Hard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int c = sc.nextInt();

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int lt = Arrays.stream(arr).min().getAsInt();
		int rt = Arrays.stream(arr).max().getAsInt()-lt;
		int answer = -1;

		//바이너리 서치로 logn 검색
		while(lt<=rt){
			int mid = (lt+rt)/2;
			if(check(arr,c,mid)){
				answer = mid;
				lt=mid+1;
				System.out.println(answer);
			}else{
				rt=mid-1;
			}
		}
		System.out.println(answer);
	}
	
	//해당 조합의 유효성 검사
	private static boolean check(int[] arr, int c, int distance) {
		int cnt = 1;
		int bfIdx = 0;
		for(int i=1; i<arr.length; i++){
			if(arr[bfIdx]+distance<=arr[i]){
				cnt++;
				bfIdx=i;
			}
			if(cnt==c) return true;
		}
		return false;
	}
}
//5 3
//1 2 8 4 9
