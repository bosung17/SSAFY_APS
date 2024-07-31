package SWEA_1989_초심자의외문검사;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int[] ans = new int[t];
		
		for (int i=0; i<t; i++) {
			
			String input = sc.next();
			
			char[] split = input.toCharArray();
			
			int N = split.length;
			
			boolean palindrome = true;
			
			for (int j=0; j<N/2; j++) {
				if (split[j] != split[N-1-j]) {
					palindrome = false;
				}
			}
			
			if (palindrome == true) {
				ans[i] = 1;
			}
			else {
				ans[i] = 0;
			}
		}
		
		for (int i=0; i<t; i++) {
			System.out.println("#" + (i+1) + " " + ans[i]);
		}
	}
}