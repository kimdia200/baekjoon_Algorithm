package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//좌표 정렬
public class _07_Object_Sort {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			int n = Integer.parseInt(br.readLine());
			Point[] arr = new Point[n];
			for(int i=0; i<n; i++){
				String[] read = br.readLine().split(" ");
				arr[i] = new Point(Integer.parseInt(read[0]), Integer.parseInt(read[1]));
			}
			Arrays.sort(arr);
			for(Point p : arr){
				System.out.println(p);
			}
		}catch (Exception e){
			System.out.println("에러발생");
		}
	}
}

class Point implements Comparable<Point> {
	private int x;
	private int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return x+" "+y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.x!=o.getX()){
			return this.x-o.getX();
		}
		return this.y-o.getY();
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}