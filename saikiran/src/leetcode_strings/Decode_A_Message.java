package leetcode_strings;
import java.util.*;
public class Decode_A_Message {

	public static void main(String[] args) {
		Decode_A_Message_Solution1 obj = new Decode_A_Message_Solution1();
		String key="the quick brown fox jumps over the lazy dog";
		String message="vkbs bs t suepuv";
		System.out.println(obj.decodeMessage(key,message));

	}

}

class Decode_A_Message_Solution1 {
    public String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();//Using String Builder to append the string
        key = key.replaceAll(" ", "");
        //Removing the spaces
        HashMap<Character,Character> letters = new HashMap<>();
        //Mapping the key into a hashmap.
        char original = 'a';
        for (int i = 0; i < key.length() ; i++) {
            if (!letters.containsKey(key.charAt(i))){
                letters.put(key.charAt(i),original++);
            }
        }
        //After the first pass all the letters of the key will be mapped with their respective original letters.
        for (int i = 0; i < message.length(); i++) {
            if (letters.containsKey(message.charAt(i))){
                //Now replacing the letters of the message with appropriate letter according to the key
                ans.append(letters.get(message.charAt(i)));
            }else{
                ans.append(message.charAt(i));
                //This is for characters other than the letters in the key example a space " "
                //They will not be replaced by any letters hence original letter is appended into the StringBuilder
            }
        }
        return ans.toString();
    }
}
/**
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.
Example 1:

	illustaration
	t h e q u i c k b r o w n f x j m p s v l a z y d g
	a b c d e f g h i j k l m n o p q r s t u v w x y z

Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".

Example 2:


	illusturation
	e l j u x h p w n y r d g t q k v i s z c f m a b o
	a b c d e f g h i j k l m n o p q r s t u v w x y z
	
	
Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
Output: "the five boxing wizards jump quickly"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".
*/