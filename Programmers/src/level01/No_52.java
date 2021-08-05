package level01;

import java.util.Arrays;
/**
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 * 
 * 2018 kakao blind recruitment - [1차] 비밀지도
 *
 */
public class No_52 {
	public static void main(String[] args) {
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		System.out.println(Arrays.toString(new No_52().solution(5, arr1, arr2)));
	}
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1 = change(n, arr1);
        String[] str2 = change(n, arr2);
        
        for(int i=0; i<n; i++) {
        	StringBuilder sb = new StringBuilder();
        	for(int j=0; j<n; j++) {
        		char a = str1[i].charAt(j);
        		char b = str2[i].charAt(j);
        		if(a=='0' && b=='0') {
        			sb.append(" ");
        		}else {
        			sb.append("#");
        		}
        	}
        	answer[i] = sb.toString();
        }
        
        return answer;
    }
	public String[] change(int n, int[] arr) {
		String[] str = new String[n];
		for(int i=0; i<arr.length; i++) {
			StringBuilder sb = new StringBuilder();
        	int num = arr[i];
        	while(num>0) {
        		sb.append(num%2);
        		num/=2;
        	}
        	while(sb.length()<n) {
        		sb.append(0);
        	}
        	str[i] = sb.reverse().toString();
        }
		return str;
	}
	
	
	//다른분이 하신 미친답안...
	public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
