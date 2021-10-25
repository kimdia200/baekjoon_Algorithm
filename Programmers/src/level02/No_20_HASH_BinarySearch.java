package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//2021 카카오블라인드 리쿠르잇- 순위검색
public class No_20_HASH_BinarySearch {
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		System.out.println(Arrays.toString(new No_20_HASH_BinarySearch().solution(info, query)));
	}
	
	public int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];
		Map<String, List<Integer>> map = new HashMap<>();
		for(int i=0; i<info.length; i++) {
			String[] temp = info[i].split(" ");
			String str = "";
			recur(temp,map,0,str);
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			map.get(it.next()).sort(null);
		}
		
		for(int i=0; i<query.length; i++) {
			String[] temp = query[i].replace(" and ", "").split(" ");
			List<Integer> list = map.get(temp[0]);
			if(list!=null) {
				answer[i] = searchIndex(list,temp[1]);
			}
		}
		return answer;
	}
	
	private int searchIndex(List<Integer> list, String string) {
		int lt = 0;
		int rt = list.size();
		int score = Integer.parseInt(string);
		System.out.println("==========="+list+" "+string);
		while (lt < rt) {
			int mid = (lt + rt) / 2;
			System.out.println("lt="+lt+", rt="+rt+", mid="+mid);
			if (list.get(mid) < score)
				lt = mid + 1;
			else
				rt = mid;
		}
		System.out.println("s="+lt);
		return list.size() - lt;
		
	}

	private void recur(String[] temp, Map<String, List<Integer>> map, int i, String str) {
		if(i==4) {
			int score = Integer.parseInt(temp[4]);
			if(map.containsKey(str)) {
				map.get(str).add(score);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(score);
				map.put(str, list);
			}
			return;
		}
		recur(temp,map,i+1,str+temp[i]);
		recur(temp,map,i+1,str+"-");
	}

	//아래방법은 정확성은 높았지만 효율성에서 빵점맞음
	public int[] solution2(String[] info, String[] query) {
        int[] answer = new int[query.length];
        
        List<People> list = new ArrayList<>();
        for(String str : info) {
        	String[] temp = str.split(" ");
        	list.add(new People(temp[0], temp[1], temp[2], temp[3], Integer.parseInt(temp[4])));
        }
        
        for(int i=0; i<query.length; i++) {
        	String str = query[i].replace(" and", "");
        	String[] temp = str.split(" ");
        	People p = new People(temp[0], temp[1], temp[2], temp[3], Integer.parseInt(temp[4]));
        	
        	int cnt=0;
        	for(int j=0; j<list.size(); j++) {
        		if(list.get(j).check(p)) cnt++;
        	}
        	answer[i]=cnt;
        }
        return answer;
    }
	
	class People{
		String lan;
		String kind;
		String career;
		String food;
		int score;
		
		public People(String lan, String kind, String career, String food, int score) {
			super();
			this.lan = lan;
			this.kind = kind;
			this.career = career;
			this.food = food;
			this.score = score;
		}
		public String getLan() {
			return lan;
		}
		public String getKind() {
			return kind;
		}
		public String getCareer() {
			return career;
		}
		public String getFood() {
			return food;
		}
		public int getScore() {
			return score;
		}
		@Override
		public String toString() {
			return "People [lan=" + lan + ", kind=" + kind + ", career=" + career + ", food=" + food + ", score="
					+ score + "]";
		}
		public boolean check(People obj) {
			if(!(obj.getLan().equals("-") || this.lan.equals(obj.getLan())))
				return false;
			if(!(obj.getKind().equals("-") || this.kind.equals(obj.getKind())))
				return false;
			if(!(obj.getCareer().equals("-") || this.career.equals(obj.getCareer())))
				return false;
			if(!(obj.getFood().equals("-") || this.food.equals(obj.getFood())))
				return false;
			if(this.score<obj.getScore())
				return false;
			return true;
		}
	}
}
