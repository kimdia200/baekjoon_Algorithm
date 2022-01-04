package do_it.chapter02;

public class Q03 {
	static int sumOf(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {5,10,73,2,-5,42};
		System.out.println("배열 a의 총합 : "+sumOf(a));
	}
}
