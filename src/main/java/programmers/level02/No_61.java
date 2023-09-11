package programmers.level02;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/154539
//코딩테스트 연습
//연습문제
//뒤에 있는 큰 수 찾기
public class No_61 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No_61().solution(new int[]{2, 3, 3, 5})));
    }

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        for(int i=0; i<numbers.length; i++){
            Iterator<Integer> it = map.keySet().iterator();
            while(it.hasNext()){
                Integer key = it.next();
                if(numbers[i]<=key) break;
                List<Integer> list = map.get(key);
                for(int idx : list){
                    answer[idx] = numbers[i];
                }
                it.remove();
            }
            map.put(numbers[i],map.getOrDefault(numbers[i],new ArrayList<>()));
            map.get(numbers[i]).add(i);
        }

        for(List<Integer> list : map.values() ){
            for(int i : list){
                answer[i] = -1;
            }
        }
        return answer;
    }
}
