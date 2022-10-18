package leetcode;

public class number_of_sentences_in_a_stringArray {

	public static void main(String[] args) {
		String arr[]= {"alice and bob love leetcode","i think so too","this is great thanks very much"};
		number_of_sentences_in_a_stringArray obj = new number_of_sentences_in_a_stringArray();
		System.out.println(obj.mostWordsFound(arr));

	}
	 public int mostWordsFound(String[] sentences) {
	        int max=0;
	        for (String s: sentences)
	        {
	            max = Math.max(max,(s.split(" ")).length);//  Here we seperate the sentence using " "(space) between them so we will get the words, then we will count the number of words in each sentence.
	            s.length();
	        }
	        return max;
	    }
}
