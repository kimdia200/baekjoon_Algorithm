package level02;

import java.util.ArrayList;
import java.util.List;

//2020카카오인턴 - 수식최대화
//https://programmers.co.kr/learn/courses/30/lessons/67257
public class No_26 {
	public static void main(String[] args) {
		System.out.println(new No_26().solution("100-200*300-500+20"));
	}
	
	public long solution(String expression) {
        long answer = 0;
        List<String[]> list = new ArrayList<>();
        list.add(new String[] {"*","+","-"});
        list.add(new String[] {"*","-","+"});
        list.add(new String[] {"+","*","-"});
        list.add(new String[] {"+","-","*"});
        list.add(new String[] {"-","*","+"});
        list.add(new String[] {"-","+","*"});
        for(String[] arr : list) {
        	answer = Math.max(answer, Math.abs(calculator(expression, arr)));
        }
        return answer;
    }	
	private long calculator(String s, String[] arr) {
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='*' || c=='+' || c=='-') {
				list.add(sb.toString());
				list.add(String.valueOf(c));
				sb=new StringBuilder();
			}else if(i==s.length()-1) {
				sb.append(c);
				list.add(sb.toString());
			}else {
				sb.append(c);
			}
		}
		for(String comp : arr) {
			while(list.contains(comp)) {
				for(int i=1; i<list.size();i++) {
					if(!list.get(i).equals(comp)) {
						continue;
					}
					long num;
					if(comp.equals("*")) {
						num = Long.parseLong(list.get(i-1)) * Long.parseLong(list.get(i+1));
					}else if(comp.equals("+")) {
						num = Long.parseLong(list.get(i-1)) + Long.parseLong(list.get(i+1));
					}else {
						num = Long.parseLong(list.get(i-1)) - Long.parseLong(list.get(i+1));
					}
					list.remove(i+1);
					list.remove(i);
					list.remove(i-1);
					list.add(i-1,String.valueOf(num));
					break;
				}
			}
		}
		return Long.parseLong(list.get(0));
	}
}
