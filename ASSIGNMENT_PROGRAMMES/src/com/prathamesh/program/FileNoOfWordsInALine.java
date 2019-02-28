package com.prathamesh.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNoOfWordsInALine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\inputfile.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		int wordCount=0;
		String line=null;
		int lineCount=0;
		while ((line=bufferReader.readLine()) != null){
			for (int i=0;i<=line.length();i++)
			{
				lineCount++;
				wordCount=line.split(" ").length;
			System.out.println("no of words in line number " + lineCount + " = " + wordCount);
			break;
			}
	}
	}

}
