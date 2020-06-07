package twoSumHash;
import java.util.HashMap;
import java.util.HashSet;
import java.io.FileNotFoundException;

public class TestLoadText {
	public static void main(String args[]) throws FileNotFoundException {
		loadText tst = new loadText("data/input_random_10_40.txt");
		HashSet<Long> data = tst.get();
		for(long key : data) {
			System.out.println(key);
		}
	}
}
