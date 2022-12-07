package leetcode_strings;
import java.util.*;
public class Truncate_Sentence {

	public static void main(String[] args) {
		Truncate_Sentence_Solution1 obj = new Truncate_Sentence_Solution1();
		System.out.println(obj.truncateSentence("Hello how are you Contestant", 4));
		Truncate_Sentence_Solution2 obj1= new Truncate_Sentence_Solution2();
		System.out.println(obj1.truncateSentence("What is the solution to this problem", 4));
		Truncate_Sentence_Solution3 obj2 = new Truncate_Sentence_Solution3();
		System.out.println(obj2.truncateSentence("chopper is not a tanuki", 5));
	}

}

class Truncate_Sentence_Solution1 {
    public String truncateSentence(String s, int k) {
        String [] arr=s.split(" ");
        StringBuilder str= new StringBuilder();
        int i=0;
        for (i=0;i<k-1;i++){
            str.append(arr[i]+" ");
        }
        str.append(arr[i]);
        return str.toString();
    }
}
class Truncate_Sentence_Solution2{
	public String truncateSentence(String s, int k) {
        int idx=0;
        int spaceCount=0;
        
        while(idx<s.length() && spaceCount<k){
            if(s.charAt(idx)==' ') spaceCount++;
            idx++;
        }
        // if(spaceCount<k) means we have to include whole string 
        return spaceCount==k?s.substring(0,idx-1):s;
    }
}

class Truncate_Sentence_Solution3{
	
	public String truncateSentence(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }
}

/**
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

 

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
Example 2:

Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".
Example 3:

Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"
 

Constraints:

1 <= s.length <= 500
k is in the range [1, the number of words in s].
s consist of only lowercase and uppercase English letters and spaces.
The words in s are separated by a single space.
There are no leading or trailing spaces.

*/