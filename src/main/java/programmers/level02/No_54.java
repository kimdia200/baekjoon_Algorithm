package programmers.level02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/17677
//코딩테스트 연습 2018 KAKAO BLIND RECRUITMENT [1차] 뉴스 클러스터링
public class No_54 {
    public static void main(String[] args) {
        System.out.println(new No_54().solution("A+C","DEF"));
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        //1. 문자열 분리
        List<String> list1 = stringParser(str1);
        List<String> list2 = stringParser(str2);
        //2. 교집합, 합집합 갯수
        double gyo = 0;
        double hap = 0;
        for(Iterator<String> it=list1.iterator(); it.hasNext();){
            String temp = it.next();
            if(list2.contains(temp)){
                it.remove();
                list2.remove(temp);
                gyo++;
            }
        }
        hap = list1.size()+list2.size()+gyo;

        //3. 리턴값 연산
        if(list1.size()==0 && list2.size()==0){
            answer=65536;
        }else{
            answer=(int)(gyo/hap*65536);
        }
        return answer;
    }
    public List<String> stringParser(String s){
        List<String> list = new ArrayList<>();
        for(int i=1; i<s.length(); i++){
            String temp = s.substring(i-1,i+1).toUpperCase().replaceAll("[^a-zA-Z]","");
            if(temp.length()==2){
                list.add(temp);
            }
        }
        return list;
    }
}
