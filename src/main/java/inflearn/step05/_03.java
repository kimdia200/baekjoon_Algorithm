package inflearn.step05;

import java.util.*;

//≈©∑π¿ŒªÃ±‚
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] base = new int[n][n];
		for(int i=0; i<base.length; i++) {
			for(int j=0; j<base[i].length; j++) {
				base[i][j] = sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<moves.length; i++) {
			moves[i] = sc.nextInt();
		}
		
		System.out.println(new _03().solution(base, moves));
	}
	private int solution(int[][] base, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<>();
		for(int move : moves){
			int doll = pickUp(move, base);
			if(doll==0) continue;
			if(!basket.isEmpty() && basket.peek()==doll){
				basket.pop();
				answer+=2;
			}else{
				basket.push(doll);
			}
		}
		return answer;
	}
	private int pickUp(int move, int[][] base){
		int result = 0;
		for(int i=0; i<base.length; i++){
			int target = base[i][move-1];
			if(target!=0){
				result=target;
				base[i][move-1]=0;
				break;
			}
		}
		System.out.println(result);
		return result;
	}

	private int solution2(int[][] base, int[] moves) {
		List<Integer> list = new ArrayList<>();
		int cnt = 0;
		for(int input : moves) {
			int target = 0;
			for(int i=0; i<base.length; i++) {
				target = base[i][input-1];
				if(target!=0) {
					base[i][input-1] = 0;
					break;
				}
			}
			if(target == 0) continue;
			else if(list.isEmpty() || list.get(list.size()-1)!=target) {
				list.add(target);
			}else {
				list.remove(list.size()-1);
				cnt++;
			}
		}
		return cnt*2;
	}
}
