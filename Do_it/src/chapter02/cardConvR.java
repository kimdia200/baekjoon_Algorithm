package chapter02;

import java.util.Arrays;

public class cardConvR {
	// 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		// 10진수 이상은 문자로 표현함으로 만들어준것
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		return digits;
	}

	public static void main(String[] args) {
		// 넉넉하게 잡았음, 추후 필요하다면 list로 하면 될것같음
		char[] d = new char[20];
		// 64를 2진수로 표현하면 몇자리 수 인가?
		System.out.println(cardConvR(64, 2, d));
		// 현재 저장된값 출력, (null을 제외하고 역순으로 출력시 x를 r진수로 표현할수 있음)
		System.out.println(Arrays.toString(d));

	}
}
