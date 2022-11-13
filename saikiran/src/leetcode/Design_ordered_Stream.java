package leetcode;
//    DOUBT ON THIS PROBLEM FROM LEET CODE PROBLEM 769 IN ARRAYS // 1656. Design an Ordered Stream
public class Design_ordered_Stream {

	public static void main(String[] args) {
	String [] str=	{"OrderedStream","insert","insert","insert","insert","insert"};
			String [] str =	[[5],[3,"ccccc"],[1,"aaaaa"],[2,"bbbbb"],[5,"eeeee"],[4,"ddddd"]]

						
	}
	

}


class OrderedStream {
    int ptr;
String[] res;

public OrderedStream(int n) {
   ptr = 0;
   res = new String[n];
}

public List<String> insert(int idKey, String value) {
   List<String> list = new ArrayList<>();
   
   res[idKey - 1] = value;
   while (ptr < res.length && res[ptr] != null) {
       list.add(res[ptr]);
       ptr++;
   }
   
   return list;
}
}

/**
Input
["OrderedStream", "insert", "insert", "insert", "insert", "insert"]
[[5], [3, "ccccc"], [1, "aaaaa"], [2, "bbbbb"], [5, "eeeee"], [4, "ddddd"]]
Output
[null, [], ["aaaaa"], ["bbbbb", "ccccc"], [], ["ddddd", "eeeee"]]

Explanation
// Note that the values ordered by ID is ["aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee"].
OrderedStream os = new OrderedStream(5);
os.insert(3, "ccccc"); // Inserts (3, "ccccc"), returns [].
os.insert(1, "aaaaa"); // Inserts (1, "aaaaa"), returns ["aaaaa"].
os.insert(2, "bbbbb"); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
os.insert(5, "eeeee"); // Inserts (5, "eeeee"), returns [].
os.insert(4, "ddddd"); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
// Concatentating all the chunks returned:
// [] + ["aaaaa"] + ["bbbbb", "ccccc"] + [] + ["ddddd", "eeeee"] = ["aaaaa", "bbbbb", "ccccc", "ddddd", "eeeee"]
// The resulting order is the same as the order above.
 

Constraints:

1 <= n <= 1000
1 <= id <= n
value.length == 5
value consists only of lowercase letters.
Each call to insert will have a unique id.
Exactly n calls will be made to insert.
*/