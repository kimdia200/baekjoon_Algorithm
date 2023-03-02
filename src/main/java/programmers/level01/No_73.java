package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/160586
//�ڵ��׽�Ʈ ����
//��������
//���� ���� ����
public class No_73 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No_73().solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"})));
    }

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        //���ĺ��� ���� �ּڰ��� �ٷ� ���Ѵ�.
        Map<Character, Integer> map = setKeyMap(keymap);

        //�Ѵܾ �ּ� Ÿ���� ���ڸ� ���Ѵ�.
        for(int i=0; i<targets.length; i++){
            answer[i] = cntKey(map, targets[i]);
        }
        return answer;
    }

    private int cntKey(Map<Character, Integer> map, String target) {
        int result = 0;
        for(char c : target.toCharArray()){
            if(!map.containsKey(c)){
                return -1;
            }
            result+=map.get(c);
        }
        return result;
    }

    private Map<Character, Integer> setKeyMap(String[] keymap) {
        Map<Character, Integer> map = new HashMap<>();
        for(String s : keymap){
            for(int i=0; i<s.length(); i++){
                map.put(s.charAt(i), Math.min(map.getOrDefault(s.charAt(i),i+1), i+1));
            }
        }
        return map;
    }
}
