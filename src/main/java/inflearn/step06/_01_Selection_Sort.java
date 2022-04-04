package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//※선택정렬
//뒤에중에 가장 작은값을 찾아 앞에 하나씩 둔다
public class _01_Selection_Sort {
	public static void main(String[] args) {
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			//값 입력
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];
			String[] str = br.readLine().split(" ");
			if(arr.length != str.length) throw new Exception();
			for(int i=0; i<str.length; i++){
				arr[i] = Integer.parseInt(str[i]);
			}

			//입력값 아래와 같음
			//6
			//13 5 11 7 23 15


			//선택정렬
			for(int i=0; i<arr.length-1; i++){
				int idx = i;
				for(int j=i+1; j<arr.length;j++){
					if(arr[idx]>arr[j]){
						idx = j;
					}
				}
				if(idx!=i){
					int tmp = arr[i];
					arr[i] = arr[idx];
					arr[idx] = tmp;
				}
			}

			//결과 출력
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]);
				if(i!=arr.length-1) System.out.print(" ");
			}
		}catch (Exception e){
			System.out.println("에러 발생");
		}
	}
}
