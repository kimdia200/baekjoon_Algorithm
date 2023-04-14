package programmers.level02;

import java.util.LinkedList;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/17680
//코딩테스트 연습 2018 KAKAO BLIND RECRUITMENT [1차] 캐시
public class No_51 {

    public static void main(String[] args) {
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        System.out.println(new No_51().solution(5,cities));
    }

    public int solution(int cacheSize, String[] cities) {
        //cacheSize = 캐시크기
        //cities = 도시이름 배열
        //cities[i] = 공백, 숫자, 특수문자등이 없는 영문자로 구성,대소문자구분X,최대20자
        int answer = 0;

        Queue<String> q = new LinkedList<>();
        for(String s : cities){
            if(cacheSize==0){
                answer+=5;
                continue;
            }
            s = s.toUpperCase();
            if(q.contains(s)){
                answer++;
                q.remove(s);
                q.add(s);
            }else if(q.size()<cacheSize){
                answer+=5;
                q.add(s);
            }else{
                answer+=5;
                q.poll();
                q.add(s);
            }
        }
        return answer;
    }
}
