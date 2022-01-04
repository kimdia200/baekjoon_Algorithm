package programmers.level02;

import java.util.Arrays;

//전화번호목록
public class No_10_Hashing_StartWith {
	public static void main(String[] args) {
		String[] arr = {"119", "97674223", "1195524421"};
		
		System.out.println(new No_10_Hashing_StartWith().solution(arr));
	}
	//sort + startWith
	public boolean solution(String[] arr) {
		boolean answer = true;
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i+1].startsWith(arr[i])) return false;
		}
		return answer;
	}

	//hashing
//	private boolean solution(String[] phoneBook) {
//		boolean answer = true;
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		for(String s : phoneBook) {
//			map.put(s, 0);
//		}
//		if(phoneBook.length!=map.size()) return false;
//		
//		for (int i = 0; i < phoneBook.length; i++) {
//			for (int j = 1; j < phoneBook[i].length(); j++) {
//				if (map.containsKey(phoneBook[i].substring(0, j))) {
//					answer = false;
//					return answer;
//				}
//			}
//		}
//		return answer;
//	}
	
	//내가 푼것
//	public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        for(int i=0; i<phone_book.length; i++) {
//        	String s1 = phone_book[i];
//        	for(int j=i+1; j<phone_book.length; j++) {
//        		String s2 = phone_book[j];
//        		if(s1.length()>=s2.length() && check(s1,s2))
//        			return false;
//        		if(s2.length()>s1.length() && check(s2,s1))
//        			return false;
//        	}
//        }
//        return answer;
//    }
//	public boolean check(String s1, String s2) {
//		return s1.indexOf(s2) == 0 ? true : false;
//	}
}
