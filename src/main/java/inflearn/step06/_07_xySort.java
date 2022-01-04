package inflearn.step06;

import java.util.Arrays;
import java.util.Scanner;

//ÁÂÇ¥ Á¤·Ä
public class _07_xySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] arr = new Point[n];
		for(int i=0; i<n; i++) {
			arr[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		for(Point p : arr) {
			System.out.println(p);
		}
	}
}

class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x+" "+y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.x != o.x) {
			return this.x-o.x;
		}
		return this.y-o.y;
	}
}
