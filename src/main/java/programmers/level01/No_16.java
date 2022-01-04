package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 * 
 * �������� - �� ������� �����ϱ�
 *
 */
public class No_16 {
	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		System.out.println(Arrays.toString(new No_16().solution(strings, 2)));
	}
	
	public String[] solution(String[] strings, int n) {
        
        String[] answer = new String[strings.length];
        
        Map<Character, String> map = new HashMap<>();
        for(String s : strings) {
        	char c = s.charAt(n);
        	if(map.containsKey(c)) {
        		StringBuilder sb = new StringBuilder();
        		sb.append(map.get(c));
        		sb.append(" ");
        		sb.append(s);
        		map.put(c, sb.toString());
        	}else {
        		map.put(c, s);
        	}
        }
        
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort(null);
        
        int i=0;
        for(char key : list) {
        	String value = map.get(key);
        	if(value.contains(" ")) {
        		String[] arr = value.split(" ");
        		Arrays.sort(arr);
        		for(String val : arr) {
        			answer[i++] = val;
        		}
        	}else {
        		answer[i++] = value;
        	}
        }
        return answer;
    }
	
	//���ͳݿ��� ã�ƺ� ����... �����ϴ°� ���...
	public String[] solution2(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        // ArrayList ���
        ArrayList<String> array = new ArrayList<String>();
            
        for (int i=0; i<strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(array);
        
        for (int i=0; i<array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }
        
        return answer;
    }
	
	//Comparator �������ϴ� ���... �̰� ���� �����ΰͰ�����
	public String[] solution3(String[] strings, int n) {
	      Arrays.sort(strings, new Comparator<String>(){
	          @Override
	          public int compare(String s1, String s2){
	              if(s1.charAt(n) > s2.charAt(n)) return 1;
	              else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
	              else if(s1.charAt(n) < s2.charAt(n)) return -1;
	              else return 0;
	          }
	      });
	      return strings;
	  }
}
