package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//위클리 챌린지 - 전력망을 둘로 나누기
//https://programmers.co.kr/learn/courses/30/lessons/86971
public class No_31_hard {
	public static void main(String[] args) {
		int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		System.out.println(new No_31_hard().solution(9, wires));
	}
	
	public int solution(int n, int[][] wires) {
		int min = Integer.MAX_VALUE;
		
		List<int[]> base = new ArrayList<>();
		for(int i=0; i<wires.length; i++) {
			base.add(wires[i]);
		}
		
		for(int i=0; i<wires.length; i++) {
			List<int[]> copy = new ArrayList<>(base);
			int key = copy.get(i)[0];
			copy.remove(i);
			
			Set<Integer> set = new HashSet<>();
			set.add(key);
			
			//아래 for문 이전에 썻던거
//			int beforeSize = 0;
//			while(beforeSize != copy.size()) {
//				beforeSize = copy.size();
//				Iterator<int[]> it = copy.iterator();
//				while(it.hasNext()) {
//					int[] arr = it.next();
//					Integer lt = new Integer(arr[0]);
//					Integer rt = new Integer(arr[1]);
//					if(set.contains(lt) || set.contains(rt)) {
//						set.add(lt);
//						set.add(rt);
//						it.remove();
//					}
//				}
//			}
			
			for(int j=0; j<copy.size(); j++) {
				int[] arr = copy.get(j);
				Integer lt = new Integer(arr[0]);
				Integer rt = new Integer(arr[1]);
				if(set.contains(lt) || set.contains(rt)) {
					set.add(lt);
					set.add(rt);
					copy.remove(j);
					j=-1;
				}
			}
			
			
			min = Math.min(min, Math.abs(set.size()-(n-set.size())));
			System.out.println("=====================================");
			System.out.println(Arrays.toString(base.get(i)));
			System.out.println(set.size()+" " +(n-set.size()));
		}
		System.out.println("=====================================");
		return min;
	}
}
