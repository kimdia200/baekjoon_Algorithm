package level01;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 *
 * ���
 * 
 * �ʹ���....
 * 
 * ��Ʈ�� ����� �����ѵ� �ð����⵵ �������䵥?....
 */
public class No_39 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(new No_39().solution2(arr));
	}
	public double solution(int[] arr) {
        double answer = 0;
        for(int x : arr) {
        	answer += x;
        }
        return answer/arr.length;
    }
	
	public double solution2(int[] arr) {
		return Arrays.stream(arr).average().orElse(0);
	}
}
