package leetcode_strings;
import java.util.*;
public class Panagram {

	public static void main(String[] args) {
		
		Panagram_Solution1 obj = new Panagram_Solution1();
		if(obj.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
			System.out.println("given sentence is a panagram");
		else
			System.out.println("given sentence is a panagram");
	}

}
class Panagram_Solution1 {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set= new HashSet<Character>();
        if(sentence.length()<26)
            return false;
        boolean cond=true;
        for (int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
            
        }
        for (char c='a';c<='z';c++){
            if(!set.contains(c))
                return false;
        }
        return cond;
    }
}

/**
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
*/