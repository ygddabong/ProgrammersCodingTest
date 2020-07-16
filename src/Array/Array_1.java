package Array;

import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) {
//		array(int[])	
//		commands(int[][])
//		Return
		
//		[1, 5, 2, 6, 3, 7, 4]
//		[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
//		[5, 6, 3]

	}

	class Solution {
		public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];

			for (int i = 0; i < commands.length; i++) {
				int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
				Arrays.sort(temp);
				answer[i] = temp[commands[i][2] - 1];
			}
			return answer;
		}
	}
}
