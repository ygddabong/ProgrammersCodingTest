package Hash.Hash_2;

import java.util.Arrays;

/** 전화번호 목록 (Phone Book) — https://school.programmers.co.kr/learn/courses/30/lessons/42577 */
public class Solution {
	public boolean solution(String[] phone_book) {
		// After sorting, a number that is a prefix of another sorts directly before
		// one of the numbers it prefixes, so only neighbours need checking.
		// (The original version compared every pair: O(n^2).)
		String[] sorted = phone_book.clone();
		Arrays.sort(sorted);
		for (int i = 0; i < sorted.length - 1; i++) {
			if (sorted[i + 1].startsWith(sorted[i])) {
				return false;
			}
		}
		return true;
	}
}
