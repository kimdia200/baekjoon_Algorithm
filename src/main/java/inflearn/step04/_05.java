package inflearn.step04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//K번째 큰수
//Treeset = 자동으로 정렬해주는 set구조
//생성자에 Collections.reverseOrder()를 넣으면 거꾸로 정렬되며 입력됨
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		solution(n, k, list);
	}
	public static void solution0(int n, int k, List<Integer> list) {
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l = j+1; l<n; l++) {
					set.add(list.get(i)+list.get(j)+list.get(l));
				}
			}
		}
		list = new ArrayList<Integer>(set);
		if(list.size()<k) {
			System.out.println(-1);
		}else {
			System.out.println(list.get(k-1));
		}
	}
	
	//내가푼거
	public static void solution(int n, int k, List<Integer> list) {
		Set<Integer> result = new TreeSet<>(Collections.reverseOrder());
		List<Integer> temp = new ArrayList<>();
		recursive(list,temp,result,3);
		list = new ArrayList<>(result);
		if(list.size()<k) {
			System.out.println(-1);
		}else {
			System.out.println(list.get(k-1));
		}
	}
	private static void recursive(List<Integer> list, List<Integer> temp, Set<Integer> result, int cnt) {
		if(cnt==0) {
			int sum = 0;
			for(int x : temp) {
				sum+=x;
			}
			result.add(sum);
			return;
		}
		
		for(int i=0; i<list.size(); i++) {
			temp.add(list.remove(i));
			recursive(list, temp, result, cnt-1);
			list.add(i,temp.remove(temp.size()-1));
		}
	}
}
