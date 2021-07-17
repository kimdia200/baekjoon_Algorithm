package level01;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 * 
 * 2019 카카오개발자 인턴쉽
 * 
 * 크레인 인형뽑기 게임
 *
 */
public class No_06 {
	public static void main(String[] args) {
		No_06 n = new No_06();
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
				};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(n.solution(board, moves));
	}
	
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        //뽑아온 인형을 담아둘 리스트객체
        List<Integer> bucket = new ArrayList<>();
        
        for(int select : moves) {
        	boolean skip = true;
        	for(int i = 0; i<board.length; i++) {
        		if(board[i][select-1]==0)
        			continue;
        		bucket.add(board[i][select-1]);
        		board[i][select-1]=0;
        		skip=false;
        		break;
        	}
        	if(skip) continue;
        	int size = bucket.size();
        	if(size<2) continue;
        	if(bucket.get(size-1) != bucket.get(size-2)) continue;
        	bucket.remove(size-1);
        	bucket.remove(size-2);
        	answer+=2;
        }
        
        return answer;
    }
}
