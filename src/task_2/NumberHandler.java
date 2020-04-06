package task_2;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class NumberHandler {
	private Integer smallestNum; //Tracks the smallest subtraction between numbers.
	
	private void findSmallestNum(Integer[] numberarray) {
		
		//Duplicate numbers have no effect to the result so it's practical to remove any duplicates. 
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numberarray) );
		Integer[] numbers = linkedHashSet.toArray(new Integer[] {});
		
		//Check that array has at least 2 numbers and initialize canditate for smallestNum.
		if(numbers.length < 2) {
			System.out.println("Input has to include at least two different numbers");
			System.exit(0);
		} else {
			this.smallestNum = Math.abs(numbers[0] - numbers[1]);
		}
		
		//Find the smallestNum value
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
					if(Math.abs(numbers[i] - numbers[j]) < smallestNum && i != j) {
						smallestNum = Math.abs(numbers[i] - numbers[j]);
					}				
			}
		}
	}
	
	public int getSmallestAmount(Integer[] numberarray) {
		findSmallestNum(numberarray);
		return smallestNum - 1;  // Return the final result for how many numbers will fit.
	}
		
}
