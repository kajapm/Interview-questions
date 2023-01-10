package set40;

import java.util.Arrays;

public class PatternFind {
	public static void main(String[] args) {
		System.out.println(new Solution().wildCard("ab*123?", "ab11231231"));
	}
}

class Solution {
	int[][] dp;

	public int solve(String str, int i, int n, String pattern, int j, int m) {
		if (i == n && j != m) {
			while (j < m && pattern.charAt(j) == '*') {
				j++;
			}
			if (j == m) {
				return 1;
			}
			return 0;
		}
		if (j == m && i != n) {
			return 0;
		}
		if (j == m && i == n) {
			return 1;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int temp = 0;
		if (pattern.charAt(j) == '*') {
			temp = solve(str, i + 1, n, pattern, j, m) | solve(str, i, n, pattern, j + 1, m);
		} else if (pattern.charAt(j) == '?') {
			temp = solve(str, i + 1, n, pattern, j + 1, m);
		} else {
			if (i < n) {
				if (str.charAt(i) == pattern.charAt(j)) {
					temp = solve(str, i + 1, n, pattern, j + 1, m);
				}
			} else {
				return 0;
			}
		}
		dp[i][j] = temp;
		System.out.println(Arrays.deepToString(dp));
		return dp[i][j];
	}

	int wildCard(String pattern, String str) {
		int n = str.length();
		int m = pattern.length();
		dp = new int[n + 1][m + 1];

		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		return solve(str, 0, n, pattern, 0, m);

	}
}
