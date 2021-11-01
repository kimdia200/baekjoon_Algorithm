package level02;

import java.util.Arrays;

//탐욕법 - 구명보트
//https://programmers.co.kr/learn/courses/30/lessons/42885
//two Point 알고리즘
public class No_29 {
	public static void main(String[] args) {
		int[] people = {70,50,80,50};
		int limit = 100;
		System.out.println(new No_29().solution(people, limit));
	}
	
	public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lt=0;
        int rt=people.length-1;
        while(lt<=rt) {
        	int sum = people[lt]+people[rt];
        	if(lt!=rt-- && sum<=limit) lt++;
        	answer++;
        }
        return answer;
    }
}
