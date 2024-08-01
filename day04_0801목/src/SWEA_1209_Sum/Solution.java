package SWEA_1209_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] max = new int[10];
		
		for (int i=0; i<10; i++) {
			
			int t = sc.nextInt();
			
			int[][] arr = new int[100][100];
			
			for (int r=0; r<100; r++) {
				for (int c=0; c<100; c++) {
					arr[r][c] = sc.nextInt();
				}
			}		
			
			// ↘ 대각선 합
			int maybeMax = 0;
			for (int r=0; r<100; r++) {
				maybeMax += arr[r][r];
			}
			
			if (maybeMax > max[i]) {
				max[i] = maybeMax;
			}
			
			// ↙ 대각선 합
			maybeMax = 0;
			for (int r=0; r<100; r++) {
				maybeMax += arr[r][99-r];
			}
			
			if (maybeMax > max[i]) {
				max[i] = maybeMax;
			}
			
			// 가로들의 합
			for (int r=0; r<100; r++) {
				maybeMax = 0;
				for (int c=0; c<100; c++) {
					maybeMax += arr[r][c];
				}
				if (maybeMax > max[i]) {
					max[i] = maybeMax;
				}
			}
			
			// 세로들의 합
			for (int r=0; r<100; r++) {
				maybeMax = 0;
				for (int c=0; c<100; c++) {
					maybeMax += arr[c][r];
				}
				if (maybeMax > max[i]) {
					max[i] = maybeMax;
				}
			}
		}
		
		for (int i=0; i<10; i++) {
			System.out.println("#" + (i+1) + " " + max[i]);
		}
	}
}