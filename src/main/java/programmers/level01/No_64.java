package programmers.level01;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/142086
//코딩테스트 연습
//연습문제
//가장 가까운 같은 글자
public class No_64 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No_64().solution("banana")));
    }

    public int[] solution(String s) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        String[] arr = s.split("");
        for(int i=0; i<arr.length; i++){
            int last = map.getOrDefault(arr[i],i);
            if(last==i) list.add(-1);
            else list.add(i-last);
            map.put(arr[i],i);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }

    public int[] solution2(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}
