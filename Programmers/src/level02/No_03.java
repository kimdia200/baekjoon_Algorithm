package level02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//����ä�ù�
public class No_03 {
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

		System.out.println(Arrays.toString(new No_03().solution(record)));
	}
	
	public String[] solution(String[] record) {
        
        Map<String, String> map = new HashMap<>();
        int len = record.length;
        for(String s : record) {
        	String[] temp = s.split("[ ]");
        	if(temp[0].equals("Change")) len--;
        	else if(temp[0].equals("Leave")) continue;
        	map.put(temp[1], temp[2]);
        }
        
        String[] answer = new String[len];
        int idx=0;
        
        for(int i=0; i<record.length; i++) {
        	String[] temp = record[i].split("[ ]");
        	if(temp[0].equals("Enter")) {
        		answer[idx++] = String.format("%s���� ���Խ��ϴ�.", map.get(temp[1]));
        	}else if(temp[0].equals("Leave")) {
        		answer[idx++] = String.format("%s���� �������ϴ�.", map.get(temp[1]));
        	}
        }
        
        return answer;
    }
}
