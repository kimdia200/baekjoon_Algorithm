package programmers.level01;

import java.util.*;

// 코딩테스트 연습 - 2022 kakao blind recruitment
// https://programmers.co.kr/learn/courses/30/lessons/92334
public class No_57 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list,report,k)));
    }

    private static int[] solution(String[] id_list, String[] report, int k) {

        //신고리스트
        Map<String, Set<String>> map = new HashMap<>();
        for(String id : id_list){
            map.put(id,new HashSet<>());
        }

        //신고접수
        Map<String, Integer> count = new HashMap<>();
        for(String s : report){
            String[] t = s.split("[ ]");
            if(map.get(t[0]).add(t[1])){
                count.put(t[1],count.getOrDefault(t[1],0)+1);
            }
        }

        //메일 받은 횟수 저장
        Map<String, Integer> mail = new HashMap<>();
        for(String key : map.keySet()){
            int cnt = 0;
            for(String s : map.get(key)){
                if(count.get(s)>=k) cnt++;
            }
            mail.put(key,cnt);
        }

        int[] result = new int[id_list.length];
        for(int i=0; i<id_list.length; i++){
            result[i] = mail.getOrDefault(id_list[i],0);
        }

        return result;
    }
}