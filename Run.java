package twoSumHash;

import java.io.FileNotFoundException;

public class Run {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//TwoSum ts = new TwoSum("data/input_random_40_5120.txt");
		//TwoSum ts = new TwoSum("data/2sum.txt");
		//TwoPointer ts = new TwoPointer("data/input_random_68_640000.txt");
		TwoPointer ts = new TwoPointer("data/2sum.txt");
		System.out.println(ts.count(-10000, 10000));

	}

}
