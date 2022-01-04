package programmers.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 2021 카카오 채용연계형 인턴십 = 거리두기 확인하기
public class No_12_hard {
	public static void main(String[] args) {
		String[][] places = { { "POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP" },
				{ "POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP" }, { "PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX" },
				{ "OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO" }, { "PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP" } };
		System.out.println(Arrays.toString(new No_12_hard().solution(places)));
	}
	
	public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int i=0; i<places.length; i++) {
        	answer[i] = check(places[i]);
        }
        return answer;
    }

	private int check(String[] arr) {
		List<Point> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				char c = arr[i].charAt(j);
				if(c=='P') {
					list.add(new Point(i, j));
				}
			}
		}
		for(int i=0; i<list.size(); i++) {
			Point p1 = list.get(i);
			for(int j=i+1; j<list.size(); j++) {
				Point p2 = list.get(j);
				int distance = Math.abs(p1.getX()-p2.getX())+Math.abs(p1.getY()-p2.getY());
				if(distance==1) return 0;
				if(distance<=2) {
					int minX = Math.min(p1.getX(), p2.getX());
					int minY = Math.min(p1.getY(), p2.getY());
					int maxX = Math.max(p1.getX(), p2.getX());
					int maxY = Math.max(p1.getY(), p2.getY());
					if(p1.getX()==p2.getX()) {
						if(arr[p1.getX()].charAt(minY+1)!='X') {
							return 0;
						}
					}else if(p1.getY()==p2.getY()) {
						if (arr[minX+1].charAt(p1.getY()) != 'X') {
							return 0;
						}
					}else {
						if(p1.getY()<p2.getY()) {
							if (arr[minX].charAt(maxY) != 'X') {
								return 0;
							}
							if(arr[maxX].charAt(minY)!='X'){
								return 0;
							}
						}else {
							if(arr[minX].charAt(minY)!='X') {
								return 0;
							}
							if(arr[maxX].charAt(maxY)!='X') {
								return 0;
							}
						}
					}
				}
			}
		}
		return 1;
	}
	
	class Point{
		int x;
		int y;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "[x=" + x + ", y=" + y + "]";
		}
		
	}
}
