package 스위치;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 스위치의 개수 입력
		int N = sc.nextInt();
		
		// 스위치 저장하기 위한 배열 sw 생성
		int[] sw = new int[N+1];
		
		// 스위치의 상태를 배열에 저장
		for (int i = 1; i <= N; i++) {
			sw[i] = sc.nextInt();
		}
		
		// 학생 수 입력
		int stuNum = sc.nextInt();
		
		// 학생 마다 성별, 숫자에 따라 스위치 배열 바꾸기
		for (int i = 0; i < stuNum; i++) {
			
			int gen = sc.nextInt();
			int num = sc.nextInt();
			
			// 남자이면 숫자의 배수마다 스위치 바꾸기
			if (gen == 1) {
				for (int j = num; j < N; j += num) {
					if (sw[j] == 0) {
						sw[j]++;
					}
					else {
						sw[j]--;
					}
				}
			}
			// 여자이면 좌우 대칭일때까지 d를 찾고 대칭인 구간의 스위치 바꾸기
			else {
				int D = 0;
				for (int d = 1; d < N; d++) {
					if (num+d <= N && num-d >=1) {
						if (sw[num+d] == sw[num-d]) {
							D = d;
						}
						else {
							break;
						}
					}
				}
				for (int j = num - D; j <= num + D; j++) {
					if (sw[j] == 0) {
						sw[j]++;
					}
					else {
						sw[j]--;
					}
				}
			}
		}
		
		// 바꾼 후의 스위치 상태 출력
		for (int i = 1; i <= N; i++) {
			System.out.print(sw[i] + " ");
		}
	}
}
