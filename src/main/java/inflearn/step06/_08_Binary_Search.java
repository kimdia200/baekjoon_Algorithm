package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//이진 탐색 Binary Search
public class _08_Binary_Search {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			//입력값
			//15 99
			//73 32 31 49 94 37 40 62 78 66 27 100 99 29 9
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int target = Integer.parseInt(str[1]);

			str = br.readLine().split(" ");
			int[] arr = new int[n];
			for(int i=0; i<arr.length; i++){
				arr[i] = Integer.parseInt(str[i]);
			}
//			System.out.println(binarySearch(arr,target));
			int[] copy = arr.clone();
			Arrays.sort(copy);
			for(int i=0; i<arr.length; i++){
				System.out.println(binarySearch(arr.clone(),copy[i]));
			}
			System.out.println(binarySearch(arr.clone(),500));
		}catch (Exception e){
			System.out.println("에러발생");
		}
	}

	private static int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		System.out.println("===================================");
		System.out.println(Arrays.toString(arr) + ", traget = " + target);
		int lt=0;
		int rt=arr.length-1;
		while(lt<=rt){
			int mid = (lt+rt)/2;
			System.out.println("lt = "+arr[lt]+", rt = "+arr[rt]+", mid = "+arr[mid]);
			if(arr[mid] == target) {
				return mid+1;
			}else if(target<arr[mid]){
				rt=mid-1;
			}else{
				lt=mid+1;
			}
		}
		return -1;
	}
}