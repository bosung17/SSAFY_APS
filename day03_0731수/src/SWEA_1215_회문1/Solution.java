package SWEA_1215_회문1;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		char[][] board = new char[8][8];
		
		String[] test = new String[8];
		
		for (int i=0; i<8; i++)
			test[i] = sc.next();
		
		for (int i=0; i<8; i++)
			for (int j=0; j<8; j++) {
				board[i][j] = test[i].charAt(j);
			}
		
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}