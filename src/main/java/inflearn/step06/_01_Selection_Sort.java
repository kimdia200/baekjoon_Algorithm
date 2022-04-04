package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//�ؼ�������
//�ڿ��߿� ���� �������� ã�� �տ� �ϳ��� �д�
public class _01_Selection_Sort {
	public static void main(String[] args) {
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			//�� �Է�
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];
			String[] str = br.readLine().split(" ");
			if(arr.length != str.length) throw new Exception();
			for(int i=0; i<str.length; i++){
				arr[i] = Integer.parseInt(str[i]);
			}

			//�Է°� �Ʒ��� ����
			//6
			//13 5 11 7 23 15


			//��������
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

			//��� ���
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]);
				if(i!=arr.length-1) System.out.print(" ");
			}
		}catch (Exception e){
			System.out.println("���� �߻�");
		}
	}
}
