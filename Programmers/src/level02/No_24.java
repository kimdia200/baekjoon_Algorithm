package level02;

import java.util.Arrays;

//����/ť - �ֽİ��� 
//https://programmers.co.kr/learn/courses/30/lessons/42584
//����ť �������ٴ� ����Ž�� ����������
public class No_24 {
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		System.out.println(Arrays.toString(new No_24().solution(prices)));
	}
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        	
        for(int i=0; i<prices.length; i++) {
        	for(int j=i+1; j<prices.length; j++) {
        		answer[i]++;
        		if(prices[i]>prices[j]) break;
        	}
        }
        return answer;
    }
}
