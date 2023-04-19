package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/17684
//코딩테스트 연습 2018 KAKAO BLIND RECRUITMENT [3차] 압축
public class No_57 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new No_57().solution("KAKAO")));
    }

    public int[] solution(String msg) {
        int[] answer = {};

        //사전 초기화
        List<String> dic = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i=(int)'A'; i<=(int)'Z'; i++){
            dic.add(String.valueOf((char)i));
        }

        for(int i=0; i<msg.length(); i++){
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(i));
            for(int j=i+1; j<msg.length(); j++){
                sb.append(msg.charAt(j));
                if(!dic.contains(sb.toString())){
                    dic.add(sb.toString());
                    sb = new StringBuilder(sb.substring(0,sb.length()-1));
                    break;
                }else{
                    i++;
                }
            }
            result.add(dic.indexOf(sb.toString())+1);
        }
        answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
