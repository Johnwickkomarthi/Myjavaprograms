package cognigent;

import java.util.*;

public class Beauty {
	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 5, 4, 6 };
		int b[] = { 2, 1, 3, 4, 3, 4 };
		System.out.println(beauty(6, 6, "xzyabc", a, b));
	}

	public static int beauty(int n, int m, String S, int[] X, int[] Y) {
		Map<Character, Integer>[] freq = new Map[n];
		for (int i = 0; i < n; i++) {
			freq[i] = new HashMap<>();
		}
		for (int i = 0; i < n; i++) {
			freq[i].put(S.charAt(i), 1);
		}
		for (int i = 0; i < m; i++) {
			int x = X[i] - 1, y = Y[i] - 1;
			for (char c : freq[x].keySet()) {
				if (freq[y].containsKey(c)) {
					freq[y].put(c, freq[x].get(c) + freq[y].get(c));
				} else {
					freq[y].put(c, freq[x].get(c));
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int maxFreq = 0;
				for (char c : freq[i].keySet()) {
					if (freq[j].containsKey(c)) {
						maxFreq = Math.max(maxFreq, freq[j].get(c));
					}
				}
				ans = Math.max(ans, maxFreq);
			}
		}
	
		return (ans == 0)?-1:ans;
	}
}
