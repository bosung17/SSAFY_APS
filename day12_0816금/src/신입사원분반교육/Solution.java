package 신입사원분반교육;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t<= T; t++) {
			
			int N = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();
			
			// 점수를 저장하기 위한 score 배열 생성
			int[] score = new int[N];
			
			for (int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
			}
			
			// maxScore를 구하기 위해 오름차순 정렬
			Arrays.sort(score);

			int maxScore = score[N-1];
			
			// 분반을 나누기 위해 student 배열 생성
			int[] student = new int[3];
			
			// 학생이 가장 많은 분반과 적은 분반의 차의 최솟값을 구하기 위해 변수 gap 생성
			int gap = Integer.MAX_VALUE;
			
			// 분반을 나누기 위한 score1과 score2를 바꿔가며 gap 구하기
			for (int sc1 = 0; sc1 <= maxScore; sc1++) {
				for (int sc2 = sc1; sc2 <= maxScore; sc2++) {
					student = new int[3];
					for (int i = 0; i < N; i++) {
						// 점수별로 student 배열에 저장
						if (score[i] < sc1) {
							student[0]++;
						}
						else if (score[i] < sc2) {
							student[1]++;
						}
						else {
							student[2]++;
						}
					}
					Arrays.sort(student);
					// 최소 인원과 최대 인원을 만족할 때 최솟값을 gap에 저장
					if (student[0] >= min && student[2] <= max) {
						if (student[2] - student[0] < gap) {
							gap = student[2] - student[0];
						}
					}
				}
			}
			// 최소 인원, 최대 인원을 만족하지 못하면 -1을 출력하기 위해 gap을 -1로 설정
			if (gap == Integer.MAX_VALUE) {
				gap = -1;
			}
			
			// 테스트 케이스 번호와 최솟값 출력
			System.out.println("#" + t + " " + gap);
		}
	}
}
