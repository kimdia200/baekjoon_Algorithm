package sixShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class SixShop {
	
	public static void main(String[] args) {
		int n = 3;
		int[] nn = {4,2,2,5,3};
		System.out.println(Arrays.toString(new Solution().solution(n,nn)));
	}
	
}

class Solution {
    public int[] solution(int N, int[] coffee_times) {
    	//주문순서 결과값
        int[] answer = new int[coffee_times.length];
        
    	//커피 추출구 N
    	
    	//커피 만드는데 걸리는 시간 coffee_times
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0; i<coffee_times.length; i++) {
    		map.put(i+1, coffee_times[i]);
    	}
    	
    	
    	Iterator<Integer> it = null;
    	List<Integer> list = new ArrayList<>();
    	
    	int time=0;
    	int i=N+1;
    	
    	while(true) {
    		
    		if(map.isEmpty()) {
    			break;
    		}
    		
    		time++;
    		int loop=0;
    		it = map.keySet().iterator();
    		while(it.hasNext() && (loop++<N)) {
    			int key = it.next();
    			int value = map.get(key);
    			if(value == time) {
    				list.add(key);
    				it.remove();
    				if(map.containsKey(i)) {
    					map.put(i, map.get(i++)+time);
    				}
    			}
    		}
    	}
    	System.out.println("총 소요시간 = " + time + "초");
    	for(i=0; i<list.size(); i++) {
    		answer[i]=list.get(i);
    	}
    	
        return answer;
    }
}

//3번.
//class Solution {
//    public int solution(int n) {
//    	
//    	int answer = 0;
//    	int box3 = 0;
//    	int box5 = 0;
//    	
//    	
//    	if(n%5 == 0) {
//    		box5=n/5;
//    		return box5;
//    	}
//    	
//    	box5 = n/5;
//    	while(box5!=0) {
//    		if((n-(5*box5))%3 == 0) {
//    			box3 = (n-(5*box5))/3;
//    			return box3 + box5;
//    		}
//    		box5--;
//    	}
//    	
//    	if(n%3 == 0) {
//    		box3=n/3;
//    		return box3;
//    	}
//    	
//    	answer = -1;
//        
//        return answer;
//    }
//}


//2번.
//class Solution {
//    public int[] solution(int[] grade) {
//    	
//    	List<Integer> list = new ArrayList<Integer>();
//    	for(int x : grade) {
//    		list.add(x);
//    	}
//
//    	list.sort(null);
//    	Collections.reverse(list);
//    	
//    	Map<Integer, Integer> map = new HashMap<>();
//    	for(int x : list) {
//    		map.put(x, 0);
//    	}
//    	
//    	int rank = 1;
//    	for(int x : list) {
//    		if(map.get(x) == 0)
//    			map.put(x, rank);
//    		rank++;
//    	}
//    	
//        int[] answer = {};
//        answer = new int[list.size()];
//        for(int i=0; i<grade.length; i++) {
//        	answer[i] = map.get(grade[i]);
//        }
//        
//        return answer;
//    }
//}


//1번.
//class Solution {
//    public String solution(String s1, String s2) {
//    	
//    	int num = 1; 
//    	int roop = s1.length() >= s2.length() ? s2.length() : s1.length();
//    	int check = 0;
//    	
//    	while(roop-num >=0){
//    		String a1="";
//    		String a2="";
//    		a1 = s1.substring(s1.length()-num);
//    		if(s2.length()!=num)
//    			a2 = s2.substring(0,num);
//    		else
//    			a2 = s2;
//    		
//    		if(a1.equals(a2)) {
//    			check = num;
//    		}
//	    	num++;
//    	}
//    	String temp1="";
//    	if(s1.length()<=check) 
//    		temp1 = s1+s2.substring(check);
//    	else 
//    		temp1 = s1.substring(0,s1.length()-check)+s2;
//    	
//    	
//    	num = 1; 
//    	check = 0;
//    	while(roop-num >=0){
//    		String a1="";
//    		String a2="";
//    		a1 = s2.substring(s2.length()-num);
//    		if(s1.length()!=num)
//    			a2 = s1.substring(0,num);
//    		else
//    			a2 = s1;
//    		
//    		if(a1.equals(a2)) {
//    			check = num;
//    		}
//	    	num++;
//    	}
//    	String temp2="";
//    	if(s1.length()<=check) 
//    		temp2 = s2+s1.substring(check);
//    	else 
//    		temp2 = s2.substring(0,s2.length()-check)+s1;
//    	String answer = "";
//    	
//    	if(temp1.length()>temp2.length()) {
//    		answer = temp2;
//    	}else if(temp2.length()>temp1.length()) {
//    		answer = temp1;
//    	}else if(temp1.compareTo(temp2)>0) {
//    		answer = temp2;
//    	}else {
//    		answer = temp1;
//    	}
//        return answer;
//    }
//}