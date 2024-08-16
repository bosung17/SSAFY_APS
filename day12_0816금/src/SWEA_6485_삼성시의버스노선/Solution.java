package SWEA_6485_삼성시의버스노선;

import java.util.Scanner;

public class Solution {
     
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
         
        for (int t = 1; t <= T; t++) {
             
        	// 버스 노선의 개수 입력
            int N = sc.nextInt();
             
            // 버스 정류장 배열 생성
            int[] busStop = new int[5001];
             
            // A번의 버스정류장부터 B번의 버스정류장까지 운행하는 버스 노선 세기
            for (int i = 0; i < N; i++) {
                 
                int A = sc.nextInt();
                int B = sc.nextInt();
                 
                for (int j = A; j <= B; j++) {
                    busStop[j]++;
                }
            }
            
            int P = sc.nextInt();
             
            System.out.print("#" + t + " ");
             
            // 각 버스 정류장의 버스 노선 개수 출력
            for (int i = 0; i < P; i++) {
                int C = sc.nextInt();
                System.out.print(busStop[C] + " ");
            }
            System.out.println();
        }
    }
}