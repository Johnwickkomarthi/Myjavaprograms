package hashmap;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
	
    	HashMap<String, Double> maxMinScorers = new HashMap<>();

        // Find max marks
        double maxMarks = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() > maxMarks) {
                maxMarks = entry.getValue();
            }
        }

        // Find students who scored max marks
        for (Map.Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() == maxMarks) {
                maxMinScorers.put(entry.getKey(), entry.getValue());
            }
        }

        // Find min marks
        double minMarks = Double.MAX_VALUE;
        for (Map.Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() < minMarks) {
                minMarks = entry.getValue();
            }
        }

        // Find students who scored min marks
        for (Map.Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() == minMarks) {
                maxMinScorers.put(entry.getKey(), entry.getValue());
            }
        }

        return maxMinScorers;
	}

}
// this is O(n) time complexity as it iterates through the marks in one iteration and names in another iteration.
class Exerxise1 {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 92.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}
/**
Given a HashMap of type<String, Double> that stores names and corresponding average marks of students in a class, 
find out who scored the maximum and minimum marks. Implement the logic inside findMaxMinScorers() method. 
The method should return a HashMap<String, Double> which contains the maximum marks and the student(s) who scored the marks followed by minimum marks and the students(s) who scored it.
*/