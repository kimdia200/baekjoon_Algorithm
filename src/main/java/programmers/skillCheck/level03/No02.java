package programmers.skillCheck.level03;

import java.util.*;

public class No02 {
    public static void main(String[] args) {
        int n = 5;
        int[][] results = {{4,3},{4,2},{3,2},{1,2},{2,5}};
        System.out.println(new No02().solution(n, results));
    }
    public int solution(int n, int[][] results) {
        int answer = 0;

        //초기화
        Map<Integer, Map<String, Set<Integer>>> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            Map<String, Set<Integer>> tempMap = new HashMap<>();
            tempMap.put("win",new HashSet<>());
            tempMap.put("lose",new HashSet<>());
            map.put(i,tempMap);
            System.out.println(i + " " +tempMap);
        }
        //배열 정보 입력
        for(int i=0; i<results.length; i++){
            int front = results[i][0];
            int back = results[i][1];
            map.get(front).get("win").add(back);
            map.get(back).get("lose").add(front);
            //내가 진 상대에게도 전달
            for(int x : map.get(front).get("lose")){
                map.get(x).get("win").add(back);
                map.get(back).get("lose").add(x);
            }
        }
        //임시출력
//        for(int i=1; i<=n; i++){
//            System.out.println(map.get(i).get("win") + " " + map.get(i).get("lose"));
//        }
        for(int i=1; i<=n; i++){
            if(map.get(i).get("win").size() + map.get(i).get("lose").size()==(n-1)) answer++;
        }
        return answer;
    }
}
