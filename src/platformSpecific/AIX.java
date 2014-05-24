package platformSpecific;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AIX implements OSType 
{
	final String OSType = "AIX";

	@Override
	public int firstLineCSVIndex()
	{
		String line = null;
		File inputFile = new File("");
		int startIndex = 0;
		int count = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));

			// repeat until all lines is read
			while ((line = reader.readLine()) != null)
			{
				if (line.toString().contains("USER"))
				{
					startIndex = line.toString().indexOf("TT") - 1;
					break;
				}
				count++;	
			}
		}
			catch (Exception e)
			{
				
			}
			return startIndex;
	}
		
	public int getNumberofCharsToRemove()
	{
		return 5;
	}
	
	public int getCSVStartline() {

		return 0;
	}

	@Override
	public int getCSVEndLine() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getLineToRemoveStartIndex() {
		String line = null;
		File inputFile = new File("");
		int startIndex = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			FileWriter fstream = new FileWriter("", true);
			int count = 0;

			// repeat until all lines is read
			while ((line = reader.readLine()) != null)
			{
				if (line.toString().contains("USER"))
				{
					startIndex = line.toString().indexOf("TT") - 1;
					break;
				}
				count++;	
			}
		}
			catch (Exception e)
			{
				
			}
			return startIndex;
	}

	@Override
	public int getLineToRemoveEndIndex() {
		// TODO Auto-generated method stub
		String line = null;
		File inputFile = new File("");
		int endIndex = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			FileWriter fstream = new FileWriter("", true);
			int count = 0;

			// repeat until all lines is read
			while ((line = reader.readLine()) != null)
			{
				if (line.toString().contains("USER"))
				{
					endIndex = line.toString().indexOf("ST") + 2;
					break;
				}
				count++;	
			}
		}
			catch (Exception e)
			{
				
			}
			return endIndex;
	}

}
