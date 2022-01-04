package inflearn.step06;

import java.util.Arrays;
import java.util.Scanner;

//��������(�����˰���)
//�䱸�ϴ� ������ lt ~ rt���̿� �ִٰ� Ȯ���� ���� �����˰��� ���
public class _09_Binary_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		System.out.println(solution(arr,n,m));
	}

	private static int solution(int[] arr, int n, int m) {
		int answer = 0;
		//�ּҿ뷮�� ����ū��
		//�ִ�緮�� ���忡 ����� ��� ����
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)<=m) {
				answer = mid;
				rt=mid-1;
			}else {
				lt = mid+1;
			}
		}
		return answer;
	}
	
	//�ش�뷮���� �ϸ� cd�� ���峪����?
	public static int count(int[]arr , int capacity) {
		int cnt=1, sum=0;
		for(int x: arr) {
			if(sum+x<=capacity) sum+=x;
			else {
				cnt++;
				sum=x;
			}
		}
		return cnt;
	}
}
