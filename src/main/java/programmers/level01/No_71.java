package programmers.level01;

import java.util.HashMap;
import java.util.Map;
//https://school.programmers.co.kr/learn/courses/30/lessons/118666
//코딩테스트 연습
//2022 KAKAO TECH INTERNSHIP
//성격 유형 검사하기
public class No_71 {
    public static void main(String[] args) {
        System.out.println(new No_71().solution(new String[]{"AN", "CF", "MJ", "RT", "NA"},new int[]{5, 3, 2, 7, 5}));
    }


    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        String[] base = {"RT", "CF", "JM", "AN"};
        int[] score = {3,2,1,0,1,2,3};
        Map<Character,Integer> sum = new HashMap<>();

        for(int i=0; i<survey.length; i++){
            int choice = choices[i]-1;
            if(choice<=3){
                sum.put(survey[i].charAt(0),sum.getOrDefault(survey[i].charAt(0),0)+score[choice]);
            }else{
                sum.put(survey[i].charAt(1),sum.getOrDefault(survey[i].charAt(1),0)+score[choice]);
            }
        }

        for(String s : base){
            char a = s.charAt(0);
            char b = s.charAt(1);
            int cntA = sum.getOrDefault(a, 0);
            int cntB = sum.getOrDefault(b, 0);
            if(cntA>cntB){
                answer.append(a);
            }else if(cntA<cntB){
                answer.append(b);
            }else{
                answer.append(a<b ? a:b);
            }
        }

        return answer.toString();
    }
}
