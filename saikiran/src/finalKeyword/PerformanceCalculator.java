package finalKeyword;

public class PerformanceCalculator {

	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setPoint(90);
		
		System.out.println(PerformanceRating.calculatePerformance(employee));
	}

}
// this is exercise based on both the final and static keyword