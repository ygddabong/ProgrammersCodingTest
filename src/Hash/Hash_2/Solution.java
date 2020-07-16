package Hash.Hash_2;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
//		phone_book(string[])	
//		Return
		
//		["119", "97674223", "1195524421"]
//		false
		
//		["123", "456", "789"]
//		true
		
//		["12", "123", "1235", "567", "88"]
//		false

	}
    public boolean solution(String[] phone_book) {
		boolean answer = true;

    	for (int i = 0; i < phone_book.length-1; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				if (phone_book[i].startsWith(phone_book[j])) {
					answer = false;
					break;
				}
				if (phone_book[j].startsWith(phone_book[i])) {
					answer = false;
					break;
				}
			}
		}
    	return answer;
    }
}
