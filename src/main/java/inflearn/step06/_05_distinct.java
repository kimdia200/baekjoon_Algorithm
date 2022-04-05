package inflearn.step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

//�ߺ�Ȯ��
public class _05_distinct {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			//set�� �̿��Ұ�
			Set<String> set = new HashSet<>();

			//�Է�
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");

			System.out.println(check(set, str));
		}catch (Exception e){
			System.out.println("�����߻�");
		}
	}

	private static String check(Set<String> set, String[] str) {
		for(String s : str){
			if(!set.add(s)) return "D";
		}
		return "U";
	}
}
