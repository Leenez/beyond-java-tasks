package task_2;

public class Main {

	public static void main(String[] args) {
		NumberHandler nh = new NumberHandler();
		Integer[] naturalNumbers = new Integer[] {0,4}; 
		int smallest = nh.getSmallestAmount(naturalNumbers);
		System.out.println(smallest);
	}
	
}
