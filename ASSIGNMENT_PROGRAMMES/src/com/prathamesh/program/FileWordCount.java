package com.prathamesh.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\inputfile.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line=null;
		int wordCount=0;
		while((line=bufferReader.readLine())!=null){
			wordCount=wordCount + line.split(" ").length;
		}
		System.out.println(wordCount);
	}

}
