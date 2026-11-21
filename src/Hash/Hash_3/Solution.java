package Hash.Hash_3;

import java.util.HashMap;
import java.util.Map;

/** 위장 (Camouflage) — https://school.programmers.co.kr/learn/courses/30/lessons/42578 */
public class Solution {
	public int solution(String[][] clothes) {
		Map<String, Integer> countByType = new HashMap<>();
		for (String[] item : clothes) {
			countByType.merge(item[1], 1, Integer::sum);
		}
		// For each type: wear one of its items or none, then exclude "wear nothing".
		int combinations = 1;
		for (int count : countByType.values()) {
			combinations *= count + 1;
		}
		return combinations - 1;
	}
}
