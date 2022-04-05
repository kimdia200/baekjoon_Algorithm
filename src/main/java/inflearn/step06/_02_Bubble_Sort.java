package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//※ 버블정렬 
//가장 큰수를 하나씩 뒤로 보내는 방법
public class _02_Bubble_Sort {
	public static void main(String[] args) {
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			//값 입력
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];
			String[] str = br.readLine().split(" ");
			if(arr.length!=str.length) throw new Exception();
			for(int i=0; i<size; i++){
				arr[i] = Integer.parseInt(str[i]);
			}

			//입력한값
			//6
			//13 5 11 7 23 15

			//버블정렬
			for(int i=0; i<arr.length-1; i++){
				for(int j=0; j<arr.length-i-1; j++){
					if(arr[j]>arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}

			//출력
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]);
				if(i!=arr.length-1){
					System.out.print(" ");
				}
			}
		}catch (Exception e){
			System.out.println("에러발생");
		}
	}
}
