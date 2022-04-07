package inflearn.step06;

import java.util.Arrays;
import java.util.Scanner;


//���������ϱ�
//���� ����� �� ���� �ִ� �Ÿ��� ���Ͻÿ� = �ּ� �������� ��ȿ�� ������ ã�� �ּҰ����� ����ϸ� �ȴ�.
public class _10_Binary_Search_Hard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int c = sc.nextInt();

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int lt = Arrays.stream(arr).min().getAsInt();
		int rt = Arrays.stream(arr).max().getAsInt()-lt;
		int answer = -1;

		//���̳ʸ� ��ġ�� logn �˻�
		while(lt<=rt){
			int mid = (lt+rt)/2;
			if(check(arr,c,mid)){
				answer = mid;
				lt=mid+1;
				System.out.println(answer);
			}else{
				rt=mid-1;
			}
		}
		System.out.println(answer);
	}
	
	//�ش� ������ ��ȿ�� �˻�
	private static boolean check(int[] arr, int c, int distance) {
		int cnt = 1;
		int bfIdx = 0;
		for(int i=1; i<arr.length; i++){
			if(arr[bfIdx]+distance<=arr[i]){
				cnt++;
				bfIdx=i;
			}
			if(cnt==c) return true;
		}
		return false;
	}
}
//5 3
//1 2 8 4 9
