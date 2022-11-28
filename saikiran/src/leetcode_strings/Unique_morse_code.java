package leetcode_strings;
import java.util.*;
public class Unique_morse_code {

	public static void main(String[] args) {
		String [] words= {"gin","zen","gig","msg"};
		Unique_morse_code_Solution1 obj= new  Unique_morse_code_Solution1();
		System.out.println(obj.uniqueMorseRepresentations(words));
		

	}

}
class Unique_morse_code_Solution1{
		public int uniqueMorseRepresentations(String[] words) {
		    String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		    HashSet<String> s = new HashSet<>();
		    for (String w : words) {
		        StringBuilder sb = new StringBuilder();
		        // we use a for loop to convert the normal to string to morse code and iteraete through each character in the string and subtract the character 'a' that will 
		        // give the index to convert a character to it morse code and then add the morse string to the hashset.
		        for (int i = 0; i < w.length(); ++i)
		            sb.append(d[w.charAt(i) - 'a']);	
		        
		        s.add(sb.toString());
		    }
		    return s.size();// in hashset the duplicates are not allowed so we will get the count of the unique number of formations. 
		   
		}
}
/**
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
Return the number of different transformations among all words we have.

 

Example 1:

Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".
Example 2:

Input: words = ["a"]
Output: 1
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 12
words[i] consists of lowercase English letters.
*/