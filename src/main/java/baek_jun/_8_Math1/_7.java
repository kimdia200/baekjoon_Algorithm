package baek_jun._8_Math1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * URL:https://www.acmicpc.net/problem/2839
 * @author EkSoo
 *
 */
public class _7 {
	public static void main(String[] args) {
		while(true) {
			new _7().test();
		}
	}
	public void test() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ��KG�� �ű��� ? : ");
		int kg = sc.nextInt();
		int[] result = new int[3];
		int fv;
		int thr;
		
		//case1. 5kg�θ� ������
		if(kg%5==0)
			result[0]=kg/5;
		else
			result[0]=-1;
		
		//case2. 5kg, 3kgȥ��
		result[1]=-1;
		if(kg/5!=0) {
			for(int i=kg/5; i>0; i--) {
				thr=(kg-(5*i))/3;
				if((kg-(5*i))%3==0) {
					if(result[1]==-1)
						result[1]=i+thr;
					else if(result[1]>i+thr){
						result[1]=i+thr;
					}
				}
			}
		}
		//case3. 3kg�� ������
		if(kg%3==0)
			result[2]=kg/3;
		else
			result[2]=-1;
		
		
		//��¹�
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		boolean flag=true;
		for (int i = 0; i < result.length; i++) {
			if(result[i]!=(-1)) {
				System.out.println(result[i]);
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(-1);
	}
}
