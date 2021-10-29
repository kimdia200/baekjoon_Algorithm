package level02;

import java.util.Arrays;

//¿ÏÀüÅ½»ö - Ä«Æê
//https://programmers.co.kr/learn/courses/30/lessons/42842
public class No_23 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(new No_23().solution(24,24)));
	}
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown+yellow;
        int x = 3;
        int y = 3;
        while(true) {
        	System.out.print(x+" "+y);
        	int nowBrown = (x*2)+(y-2)*2;
        	if(x*y==sum && nowBrown==brown) {
        		System.out.println("  clear");
        		break;
        	}
        	else if(x==y){
        		x++;
        		y=3;
        	}else {
        		y++;
        	}
        	System.out.println();
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
