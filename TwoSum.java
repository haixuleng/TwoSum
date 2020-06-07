package twoSumHash;
import java.util.HashMap;
import java.util.HashSet;
import java.io.FileNotFoundException;

public class TwoSum {
	HashSet<Long> inputData;
	String inputName;
	public TwoSum(String input) throws FileNotFoundException {
		inputName = input;
		loadText ld = new loadText(inputName);
		inputData = ld.get();
		System.out.println("Finished loading input data.");
	}
	
	public boolean findTwoSum(long a, long sum) {
		long b = sum - a;
		return inputData.contains(b);
	}
	
	public int countT() {
		int count = 0;
		for(long i = -10000; i <= 10000; i ++ ) {
			for(long a: inputData) {
				if(findTwoSum(a, i)) {
					count ++;
					System.out.println(count);
					break;
				}
			}
		}
		return count;
	}
}