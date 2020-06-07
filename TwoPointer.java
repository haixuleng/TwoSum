package twoSumHash;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class TwoPointer {
	ArrayList<Long> l;
	String inputName;
	Set<Long> s;
	public TwoPointer(String input) throws FileNotFoundException {
		inputName = input;
		s = new HashSet<Long>();
		loadText ld = new loadText(inputName);
		HashSet<Long> inputData = ld.get();
		l = new ArrayList<Long>(inputData);
		Collections.sort(l);
		System.out.println("Finished loading input data.");
	}
	
	public int count(int t1, int t2) {
		int size = l.size();
		int pStart = 0;
		int pEnd = size - 1;
		long sum = 0;
		System.out.println("Min: " + l.get(pStart));
		System.out.println("Max: " + l.get(pEnd));
		
		while(pStart < pEnd) {
			sum = l.get(pStart) + l.get(pEnd);
			if(sum < t1) {
				// sum too small
				pStart ++;
			}
			else if(sum > t2) {
				// sum too large
				pEnd --;
			}
			else {
				// sum in range
				s.add(sum);
				for(int p = pStart + 1; p < pEnd; p ++) {
					// check all combinations within the pStart to pEnd by moving pStart only
					sum = (l.get(p) + l.get(pEnd));
					if(sum >= t1 && sum <= t2) {
						s.add(sum);
					}
					if(sum > t2) {
						break;
					}
				}
				pEnd --;
			}
		}
		return s.size();
	}
}
