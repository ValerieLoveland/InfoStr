package cs520.hw3.part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Test {

	public static void main(String[] args) {
		String inputFileName = "data.txt";
		FileReader fileReader = null;
		// Create the FileReader object
		try {
			fileReader = new FileReader(inputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		// Read one line at a time until end of file
		try {
			input = reader.readLine();
			while (input != null)
			{
				processInputData(input);
				input = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Close the input
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void processInputData(String data)
	{
		StringTokenizer st = new StringTokenizer(data, ",");
		String name 		= st.nextToken();
		String yearsInOffice 	= st.nextToken();
		String party 	= st.nextToken();
		String state 	= st.nextToken();
		
		Senator currentSenator = 
		new Senator(name, Integer.parseInt(yearsInOffice), party, state );
		System.out.println(currentSenator.displayInfo());
	}
}


