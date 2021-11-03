package level02;

//연습문제 - 가장큰 정사각형 찾기
///https://programmers.co.kr/learn/courses/30/lessons/12905
//효율성 검사가 0점나왔음
public class No_33_ING {
	public static void main(String[] args) {
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(new No_33_ING().solution(board));
	}
	public int solution(int[][] board) {
		int answer = 0;
		for(int i=0; i<board.length-Math.sqrt(answer); i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j]==0) {
					continue;
				}
				for(int k=j; k<board[i].length; k++) {
					if(board[i][k]==0) break;
					if(j==k) {
						answer=Math.max(answer, 1);
						continue;
					}
					if(checkSquare(board,i,j,k)) {
						answer=Math.max(answer, (int)Math.pow((k-j)+1, 2));
					}
				}
			}
		}
		return answer;
	}
	private boolean checkSquare(int[][] board, int startRow, int startColumn, int endColumn) {
		int endRow = startRow+(endColumn-startColumn);
		if(endRow>=board.length) return false;
		
		for(int i=startRow;i<=endRow; i++) {
			for(int j=startColumn; j<=endColumn; j++) {
				if(board[i][j]==0) return false;
			}
		}
		return true;
	}
}
