package Hash.Hash_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		
//		clothes(string[][])	
//		Return
		
//		[["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
//		5
		
//		[["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]
//		3

	}
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer>map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }
        return answer-1;
    }
}
