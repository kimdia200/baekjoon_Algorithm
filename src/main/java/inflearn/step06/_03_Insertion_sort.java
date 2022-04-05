package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//※삽입정렬
public class _03_Insertion_sort {
	public static void main(String[] args) {
		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			//입력값
			//6
			//11 7 5 6 10 9
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String[] str = br.readLine().split(" ");
			if(arr.length!=str.length) throw new Exception();
			for(int i=0; i<arr.length; i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			
			//삽입정렬
			for(int i=1; i<arr.length; i++){
				int tmp = arr[i];
				int j=i;
				while(j>0 && arr[j-1]>tmp){
					arr[j]=arr[j-1];
					j--;
				}
				arr[j]=tmp;
				System.out.println(n+"회차");
				System.out.println(Arrays.toString(arr));
			}

			//출력
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]);
				if(i!=arr.length-1) System.out.print(" ");
			}
		}catch (Exception e){
			System.out.println("에러발생");
		}
	}
}
