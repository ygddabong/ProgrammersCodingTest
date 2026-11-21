package Hash.Hash_1;

import java.util.Arrays;

/** 완주하지 못한 선수 (Unfinished Runner) — https://school.programmers.co.kr/learn/courses/30/lessons/42576 */
public class Solution {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[participant.length - 1];
	}
}
