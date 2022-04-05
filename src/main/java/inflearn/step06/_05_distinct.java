package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

//중복확인
public class _05_distinct {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			//set을 이용할것
			Set<String> set = new HashSet<>();

			//입력
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");

			System.out.println(check(set, str));
		}catch (Exception e){
			System.out.println("에러발생");
		}
	}

	private static String check(Set<String> set, String[] str) {
		for(String s : str){
			if(!set.add(s)) return "D";
		}
		return "U";
	}
}
