package programmers.level02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Summer/Winter Coding(~2018) - 영어 끝말잇기
//https://programmers.co.kr/learn/courses/30/lessons/12981

public class No_25 {
	public static void main(String[] args) {
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(Arrays.toString(new No_25().solution(3, words)));
	}
	public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        int player =1;
        int round =1;
        for(int i=1; i<words.length; i++) {
        	if(player+1>n) {
        		player=1;
        		round++;
        	}else {
        		player++;
        	}
        	if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0) || !set.add(words[i])) {
        		answer[0] = player;
        		answer[1] = round;
        		break;
        	}
        }
        return answer;
    }
}
