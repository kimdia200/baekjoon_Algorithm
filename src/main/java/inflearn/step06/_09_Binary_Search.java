package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//뮤직비디오(결정알고리즘)
//요구하는 정답이 lt ~ rt사이에 있다고 확신이 들경우 결정알고리즘 사용
public class _09_Binary_Search {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){

			String[] buff = br.readLine().split(" ");
			int n = Integer.parseInt(buff[0]);
			int m = Integer.parseInt(buff[1]);

			buff=br.readLine().split(" ");
			int[] arr = new int[buff.length];
			for(int i=0; i<arr.length; i++){
				int record = Integer.parseInt(buff[i]);
				arr[i] = record;
			}
			System.out.println(solution(arr,m));
		}catch (Exception e){
			System.out.println("에러발생");
		}
	}

	private static int solution(int[] arr, int m) {
		int answer = 0;

		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt<=rt){
			int mid = (lt+rt)/2;
			int cnt = getCnt(arr,mid);
			if(cnt<=m){
				answer=mid;
				rt=mid-1;
			}else{
				lt = mid+1;
			}
		}
		return answer;
	}
	private static int getCnt(int[] arr, int size){
		int cnt=1, sum=0;
		for(int x: arr) {
			if(sum+x<=size) sum+=x;
			else {
				cnt++;
				sum=x;
			}
		}
		return cnt;
	}
}
//9 3
//1 2 3 4 5 6 7 8 9
