package inflearn.step03;

import java.util.Scanner;

//���ӵ� �ڿ����� ��
//��two point �˰��� - O^2 -> O�� ���� �� �� �ִ�.
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		new _05().solution(n);
	}
	//����Ǭ��
	public void solution0 (int n) {
		int cnt = 0;
		for(int i=1; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum+=j;
				if(sum==n) {
					cnt++;
					break;
				}else if(sum>n) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
	//����Ǭ��
	public void solution(int n) {
		int answer=0, sum=0, lt=0;
		int m=n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) arr[i] = i+1;
		for(int rt=0; rt<m; rt++) {
			sum += arr[rt];
			if(sum==n) {
				answer++;
			}
			while(sum>=n) {
				sum-=arr[lt++];
				if(sum==n) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
