package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//�� �������� 
//���� ū���� �ϳ��� �ڷ� ������ ���
public class _02_Bubble_Sort {
	public static void main(String[] args) {
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			//�� �Է�
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];
			String[] str = br.readLine().split(" ");
			if(arr.length!=str.length) throw new Exception();
			for(int i=0; i<size; i++){
				arr[i] = Integer.parseInt(str[i]);
			}

			//�Է��Ѱ�
			//6
			//13 5 11 7 23 15

			//��������
			for(int i=0; i<arr.length-1; i++){
				for(int j=0; j<arr.length-i-1; j++){
					if(arr[j]>arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}

			//���
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]);
				if(i!=arr.length-1){
					System.out.print(" ");
				}
			}
		}catch (Exception e){
			System.out.println("�����߻�");
		}
	}
}
