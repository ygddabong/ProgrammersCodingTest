package Hash.Hash_1;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
//		participant(string[])	
//		completion(string[])
//		Return
		
//		["leo", "kiki", "eden"] 
//		["eden", "kiki"]
//		"leo"
		
//		["marina", "josipa", "nikola", "vinko", "filipa"]
//		["josipa", "filipa", "marina", "nikola"]
//		"vinko"
		
//		["mislav", "stanko", "mislav", "ana"]
//		["stanko", "ana", "mislav"]
//		"mislav"

	}
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
                System.out.println(participant[i]);
				answer = participant[i];
                return answer;
			}
		} 
        answer = participant[participant.length - 1];
        return answer;
    }

}
