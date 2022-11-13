package leetcode;
import java.util.*;
public class Counting_iteams_matching_rule {

	public static void main(String[] args) {
		List<List<String>> list= Arrays.asList(Arrays.asList("phone","blue","pixel"),Arrays.asList("computer","silver","lenovo"),Arrays.asList("phone","gold","iphone"));
		Counting_iteams_matching_rule_Solution1 obj= new Counting_iteams_matching_rule_Solution1();
		System.out.println(obj.countMatches(list, "color", "silver"));
		

	}

}
class Counting_iteams_matching_rule_Solution1{
public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int count=0;
    for (int i=0;i<items.size();i++){
           if (ruleKey.equals("type") && (items.get(i).get(0).equals(ruleValue))){
               count++;
           }
        if (ruleKey.equals("color") && (items.get(i).get(1).equals(ruleValue))){
               count++;
           }
        if (ruleKey.equals("name") && (items.get(i).get(2).equals(ruleValue))){
               count++;
           }
    }
    return count;
}
}


class Counting_iteams_matching_rule_Solution2{
	 public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        int index=0,count=0;
	        if(ruleKey.equals("color")){
	            index=1;
	        }
	        else if(ruleKey.equals("name")){
	            index=2;
	        }
	        for(List<String> item:items){
	            if(item.get(index).equals(ruleValue)){
	                count++;
	            }
	        }
	        return count;
	    }
}



/**
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

 

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 

Constraints:

1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.
*/