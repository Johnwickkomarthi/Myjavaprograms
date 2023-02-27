package regular_expressisons;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		String nameRegex="([A-Za-z ]+)";
		String emailRegex="([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
		String in="\\w";
		
		String mail="saikiranmatta78";
		System.out.println(mail.matches(in));// return true 

	}

}
/*
 * 	META CHARACTER :-  []
 * 
 * 	DESCRIPTION :-
 * 				Bracket expressions create a character class to match a single character within 
 * 				the brackets. '-' can be used to specify a range.
 * 	EXAMPLE :- 
 * 				[xyz] match 'x', 'y' or 'z'. [a-z] matches any letter from 'a' to 'z'
 * 
 * 
 * 
 * 	META CHARACTER :- .
 * 
 * 	DESCRIPTION :- 
 * 				Matches any single character,except a newline. Inside a bracket expression, it becomes a literal dot.
 * 
 * 	EXAMPLE :- 
 * 			b.t matches "bat", "bEt", "b8t", etc...
 * 
 * 
 * 	
 * 	META CHARACTER :-  [^]
 * 
 * 	DESCRIPTION :-
 * 				Matches a single character that is not within the brackets.
 * 
 *	EXAMPLE :-
 *			[^xyz] matches 'a', '6', etc....
 *
 *	
 *
 *	META CHARACTER :-	|
 *
 *	DESCRIPTION:-
 *				"or" expression to match alternatives.
 *
 *	EXAMPLE :-
 *			bat|cat matches "bat" or "cat"
 *
 *
 *
 *
 *
 *
 *	META CHARACTER :- ()
 *
 *	DESCRIPTION :-
 *				Group of expressions to form sub-expressions. also used to capture groups.
 *
 *	EXAMPLE :-
 *			Ma(nn|tt)er matches "Matter" or "Manner"
 *
 *
 *
 *	META CHARACTER:- \n
 *
 *	DESCRIPTION :-
 *				Matches the nth captured sub-expression group. Group are numbered from left to right.
 *
 *	EXAMPLE :-
 *			([a-z])\1 matches "dd", "hh", etc.....
 *	
 *
 *
 *	META CHARACTER :- ?
 *
 *	DESCRIPTION :-
 *				Matches the preceding element zero or one time.
 *
 *	EXAMPLE :-
 *			Ba?it matches "Bait" and "Bit"
 *
 *
 *
 *
 *	META CHARACTER :- *
 *
 *	DESCRIPTION :-
 *				Matches the preceding element zero or more times
 *
 *	EXAMPLE :-
 *			10*1 matches "11", "1001" etc....
 *
 *
 *
 *	META CHARCTER :- +
 *
 *	DESCRIPTION :-
 *				Matches the preceding element one or more times.
 *
 *	EXAMPLE :- 
 *			10+1 matches "101", "1001", etc....
 *
 *
 *
 *	MEAT CHARCTER :-  {m}
 *
 *	DESCRIPTION :-
 *				Matches the preceding element exactly m times
 *
 *	EXAMPLE:-
 *			10{4}1 matches "100001"
 *
 *
 *
 *
 *
 *	META CHARCTER :- {m,}
 *
 *	DESCRIPTION :-
 *				Matches the preceding element m or more times.
 *
 *	EXAMPLE :-
 *			 10{3,}1 matches "10001", "1000001", "10000000001", etc......
 *
 *
 *	META CAHARACTER :-	{m,n}
 *
 *	DESCRIPTION:-
 *				Matches the preceding element minimum m and maximum n times.
 *	
 *	EXAMPLE :-
 *			xy{2,3}z matches "xyyz" and "xyyyz"
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */