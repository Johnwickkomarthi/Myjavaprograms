package leetcode_strings;
import java.util.*;
public class Split_a_String_in_Balanced_Strings {

	public static void main(String[] args) {
		Split_a_String_in_Balanced_Strings_Solution1 obj = new Split_a_String_in_Balanced_Strings_Solution1();
		System.out.println(obj.balancedStringSplit("RLRRLLRLRL"));
		System.out.println(obj.balancedStringSplit("RLRRRLLRLL"));
		System.out.println(obj.balancedStringSplit("LLLLRRRR"));

	}

}

class Split_a_String_in_Balanced_Strings_Solution1 {
    public int balancedStringSplit(String s) {
        ArrayList<String> list = new ArrayList<String>();
        int idx=-1,cl=0,cr=0;
        
        for (int i=0;i<s.length();i++){
            
        	if(s.charAt(i)=='L'){
                if(cl==0)
                    idx=i;
                cl++;
            }
            else
                cr++;
            
            if(cr==cl) {
            	list.add(s.substring(idx, i));
            	cl=0;
            	cr=0;
            }
        }
        return list.size();
    }
}


class Split_a_String_in_Balanced_Strings_Solution2 {
	public int balancedStringSplit(String s) {
	    int res = 0, cnt = 0;
	    for (int i = 0; i < s.length(); ++i) {
	        cnt += s.charAt(i) == 'L' ? 1 : -1;
	        if (cnt == 0) ++res;
	    }
	    return res;             
	}   
}
/**
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".
 

Constraints:

2 <= s.length <= 1000
s[i] is either 'L' or 'R'.
s is a balanced string.
*/