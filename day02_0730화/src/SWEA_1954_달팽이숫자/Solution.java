package SWEA_1954_달팽이숫자;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 수 입력
		int T = sc.nextInt();
		
		// 2차원의 달팽이를 받기 위한 3차원 배열 snail 만들기
		int[][][] snail = new int [T][][];
		
		for (int t=0; t<T; t++) {
			
			int N = sc.nextInt();
			
			// t번째 달팽이
			snail[t] = new int [N][N];
			
			// 첫 위치 (0,0)
			int x = 0;
			int y = 0;
			
			// 방향 배열 dx, dy 만들기 (오른쪽, 아래, 왼쪽, 위)
			int[] dx = {0, 1, 0, -1};
			int[] dy = {1, 0, -1, 0};
			
			// 방향 배열을 바꾸기 위한 dir (처음은 0)
			int dir = 0;
			
			// N*N 배열에 달팽이 숫자 넣기
			for (int i=0; i<(N*N); i++) {
				
				// i가 0부터 이므로 t번째 달팽이의 (x,y)에 i+1 넣기
				snail[t][x][y] = i+1;
				
				// (x,y)를 다음 (x,y)로 변경
				x += dx[dir];
				y += dy[dir];
				
				// 다음 (x,y)가 배열을 벗어나거나, 이미 입력된 숫자가 존재하면 방향 바꾸기
				if (x<0 || x==N || y<0 || y ==N || snail[t][x][y]!=0) {
					
					dir = (dir+1)%4;
					
					// 이미 배열 밖으로 벗어나거나 숫자가 존재하는 칸으로 들어간 (x,y)를 원하는 방향으로 되돌리기 (다음 방향으로 한칸 더하고 이전 방향으로 한칸 빼기)
					x += dx[dir]-dx[(dir+3)%4];
					y += dy[dir]-dy[(dir+3)%4];
				}
			}
		}
		// 문제에서 요구하는대로 테스트 케이스 번호, 달팽이 숫자 출력
		for (int t=0; t<T; t++){
			System.out.println("#"+(t+1));
			for (int i=0; i<snail[t].length; i++) {
				for (int j=0; j<snail[t].length; j++) {
					System.out.print(snail[t][i][j] + " ");
				}
				System.out.println("");
			}
		}
	}
}
