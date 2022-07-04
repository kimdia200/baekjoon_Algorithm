package baek_jun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No_3055 {
    //상 하 좌 우
    static int[] moveI = {-1, 1, 0, 0};
    static int[] moveJ = {0, 0, -1, 1};
    public static void main(String[] args) {
        String answer = "KAKTUS";
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        Queue<int[]> dochi = new LinkedList<>();
        Queue<int[]> water = new LinkedList<>();

        String[][] map = new String[r][c];
        for(int i=0; i<r; i++){
            String[] temp = sc.next().split("");
            for(int j=0; j<c; j++){
                map[i][j] = temp[j];
                if(temp[j].equals("S")) dochi.add(new int[]{i,j});
                else if (temp[j].equals("*")) water.add(new int[]{i,j});
            }
        }
        //비어있는곳 .
        //물이차는곳 *
        //돌 x
        //비버굴 D
        //고슴도치 S
        int[][] cnt = new int[r][c];
        cnt[dochi.peek()[0]][dochi.peek()[1]] = 1;
        outter:
        while(!water.isEmpty()){
            //물먼저 계산
            int waterLoop = water.size();
            for(int i=0; i<waterLoop; i++){
                int[] nowWater = water.poll();
                for(int j=0; j<4; j++){
                    int nextI = nowWater[0]+moveI[j];
                    int nextJ = nowWater[1]+moveJ[j];
                    if(nextI>=0 && nextJ>=0 && nextI<r && nextJ <c && !map[nextI][nextJ].equals("D") && !map[nextI][nextJ].equalsIgnoreCase("X") && !map[nextI][nextJ].equals("*")){
                        map[nextI][nextJ]="*";
                        water.add(new int[]{nextI,nextJ});
                    }
                }
            }

            //고슴도치 계산
            int dochiLoop = dochi.size();
            for(int i=0; i<dochiLoop; i++){
                int[] nowDochi = dochi.poll();
                int nowCount = cnt[nowDochi[0]][nowDochi[1]];
                for(int j=0; j<4; j++){
                    int nextI = nowDochi[0]+moveI[j];
                    int nextJ = nowDochi[1]+moveJ[j];
                    if(nextI>=0 && nextJ >=0 && nextI<r && nextJ<c && !map[nextI][nextJ].equals("*") && !map[nextI][nextJ].equalsIgnoreCase("X")){
                        if(cnt[nextI][nextJ]!=0) continue;
                        if(map[nextI][nextJ].equals("D")){
                            answer = String.valueOf(nowCount);
                            break outter;
                        }
                        cnt[nextI][nextJ] = nowCount+1;
                        dochi.add(new int[]{nextI,nextJ});
                        map[nextI][nextJ] = "S";
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
