package level02;

import java.util.Arrays;

//Ž��� - ����Ʈ
//https://programmers.co.kr/learn/courses/30/lessons/42885
//two Point �˰���
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
