package Step02;

import java.util.Scanner;

//������ �ִ���
public class _09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
				sum+=arr[i][j];
			}
			//������ ���� �ִ밪���ϱ�
			if(max<sum) max = sum;
			sum=0;
		}
		//������ ���� �ִ밪 ���ϱ�
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sum+=arr[j][i];
			}
			if(max<sum) max = sum;
			sum=0;
		}
		
		//�밢 case1
		for(int i=0; i<n; i++) {
			sum+=arr[i][i];
		}
		if(max<sum) max = sum;
		sum=0;
		
		//�밢 case2
		for(int i=0; i<n; i++) {
			sum+=arr[i][n-i-1];
		}
		if(max<sum) max = sum;
		sum=0;
		System.out.println(max);
	}
}
