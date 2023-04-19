package programmers.level02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/131127#
//코딩테스트 연습 연습문제 할인 행사
public class No_55 {
    public static void main(String[] args) {
        String[] want = {"1","2"};
        int[] number = {5,5};
        String[] discount = {"1","3","3","3","1","2","1","2","1","2","1","2","1","2","1","2","1","2"};
        System.out.println(new No_55().solution(want, number, discount));
    }
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int[] cnt = new int[number.length];
        //인덱스 저장용
        Map<String, Integer> idxMap = new HashMap<>();

        for(int i=0; i<want.length; i++){
            idxMap.put(want[i],i);
        }

        for(int i=0; i<10; i++){
            if(!idxMap.containsKey(discount[i])) continue;
            cnt[idxMap.get(discount[i])]++;
            if(Arrays.equals(number, cnt)) answer++;
        }

        for(int rt=10; rt<discount.length; rt++){
            System.out.println(Arrays.toString(cnt));
            int lt=rt-10;
            if(idxMap.containsKey(discount[lt])){
                cnt[idxMap.get(discount[lt])]--;
            }
            if(idxMap.containsKey(discount[rt])){
                cnt[idxMap.get(discount[rt])]++;
            }
            if(Arrays.equals(number, cnt)){
                answer++;
            }
        }
        return answer;
    }
}
