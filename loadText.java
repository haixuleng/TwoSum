package twoSumHash;
import java.util.HashSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
public class loadText {
	String fileToLoad;
	int length = 0;
	//int[] data;
	public loadText(String fileName) throws FileNotFoundException {
		fileToLoad = fileName;
		System.out.println(fileName);
		size();
	}

	public void size() throws FileNotFoundException {
		int size = 0;
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			size ++;
			myReader.nextLine();
			//System.out.println("Length of Input: " + size);
		}
		//myReader.close();
		length = size;
		System.out.println("Length of Input: " + size);
	}

	public HashSet<Long> get() throws FileNotFoundException {
		// return an array of arrays
		//size();
		HashSet<Long> initData = new HashSet<Long>();
		//System.out.println(length);
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			String[] data = myReader.nextLine().split("\\s");
			long node = Long.parseLong(data[0]);
			initData.add(node);
		}
		myReader.close();
		System.out.println("Set size:" + initData.size());
		return initData;
	}
}