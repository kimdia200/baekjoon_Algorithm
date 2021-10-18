package level02;

import java.util.Arrays;
import java.util.Comparator;

//가장 큰수
public class No_09 {
	public static void main(String[] args) {
		int[] arr= {3,30,34,5,9};
		System.out.println(new No_09().solution(arr));
	}

	
	public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[numbers.length];
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});
        
        for(String s : arr) {
        	sb.append(s);
        }
        return sb.toString().charAt(0)!='0' ? sb.toString() : "0";
    }
}
