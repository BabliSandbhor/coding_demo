package com.demo.readwritefile;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFileWriter {
	public static void main(String[] args) throws IOException {			
		String inputFile = "src/main/resources/inputFile.txt";
		String outPutFile = "src/main/resources/reverseOutPutFile.txt";
		String inputString = readFileToString(inputFile);
		StringBuilder sb = new StringBuilder(inputString);
		String reverseStr = sb.reverse().toString();
		writeFileFromString(reverseStr, outPutFile);	
	}
	
	public static String readFileToString(String inputFile) throws IOException{
		String readStr = "";
		FileReader fileReader = new FileReader(inputFile);		
		int ch;
		while ((ch = fileReader.read()) != -1) {
			readStr += Character.toString((char) ch);
		}
		fileReader.close();
		return readStr;
		}
	
	public static void writeFileFromString(String str, String outputFileName) throws IOException {
			    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
			    writer.write(str);			    
			    writer.close();
			}
}
