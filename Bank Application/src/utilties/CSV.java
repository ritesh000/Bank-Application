package utilties;

import java.util.*;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CSV {
	// this methods will read data from ac sv file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((dataRow = br.readLine()) != null)
				
			{
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not Find File");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not Find File");
			e.printStackTrace();
		}
		return data;
	}
}
