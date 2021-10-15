package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// ´õ ¸Ê°Ô
public class No_07_Ing {
	public static void main(String[] args) {
		int[] scoville = {0,1,2,5,4,3};
		int k = 120;
		System.out.println(new No_07_Ing().solution2(scoville, k));
	}
	
	public int solution(int[] scoville, int k) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int x : scoville) {
        	list.add(x);
        }
        list.sort(null);
        if(list.get(0)==0 && list.get(1)==0) return -1;
        
        while(true) {
        	if(list.get(0)>=k) break;
        	
        	int min = list.remove(0);
        	int min2 = list.remove(0);
        	list.add(min+min2*2);
        	list.sort(null);
        	answer++;
        }
        return answer;
    }
	
	public int solution2(int[] scoville, int k) {
		int answer=0;
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		Arrays.sort(scoville);
		
		for(int i=scoville.length-1; i>=0; i--) {
			stack.add(scoville[i]);
		}
		if(stack.size()==1) {
			if(stack.pop()<k) return -1;
			else return 0;
		}
		while(stack.size()>1) {
			if(stack.get(stack.size()-1)>=k) return answer;
			int min = stack.pop();
			int min2 = stack.pop();
			
			int val = min+min2*2;
			if(val<k) return -1;
			
			sort(stack,temp,val);
			answer++;
		}
		return answer;
	}

	private void sort(Stack<Integer> stack, Stack<Integer> temp, int val) {
		while(true) {
			if(!stack.isEmpty()) {
				int x = stack.pop();
				if(x<val) {
					temp.add(x);
					continue;
				}
				stack.add(x);
			}
			stack.add(val);
			while(!temp.isEmpty()) {
				stack.add(temp.pop());
			}
			break;
		}
	}
}
