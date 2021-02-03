package chapter01;

//P.22
public class Q05 {
	public static void main(String[] args) {
		
	}
	static int mid(int a, int b, int c) {
		if((b>=a && c<=a) || b<=a && c>=a)
			return a;
		else if((a>b && c<b) || (a<b && c>b))
			return b;
		else
			return c;
	}
	//Q4에 비해 효율이 떨어지는 이유 : 해당하는 결과가 나올때 바로바로 리턴되지 않음
}
