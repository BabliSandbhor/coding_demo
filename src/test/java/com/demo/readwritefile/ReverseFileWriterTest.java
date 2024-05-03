package com.demo.com.demo;

import org.junit.Test;

import com.demo.readwritefile.ReverseFileWriter;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
public class ReverseFileWriterTest {
	
@Test
public void testReadFileExist(){
	 File file = new File("src/main/resources/inputFile.txt");
     assertTrue(file.exists());
}

@Test
public void testWriteFolderExist(){
	 File file = new File("src/main/resources/");
     assertTrue(file.exists());
}

@Test
public void testWriteFileIsReverseOfReadFile() throws IOException {
	String inputFile = "src/main/resources/inputFile.txt";
	String outPutFile = "src/main/resources/reverseOutPutFile.txt";
	String inputString = ReverseFileWriter.readFileToString(inputFile);
	StringBuilder sb = new StringBuilder(inputString);
	String reverseStr = sb.reverse().toString();
	ReverseFileWriter.writeFileFromString(reverseStr, outPutFile);	
	
	String testOutPutFile = ReverseFileWriter.readFileToString(outPutFile);
	StringBuilder testOutPutFileSb = new StringBuilder(testOutPutFile);
	String testOutPutFileStr = testOutPutFileSb.reverse().toString();
	assertTrue(inputString.equals(testOutPutFileStr));
}

}