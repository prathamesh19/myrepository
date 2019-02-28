package com.prathamesh.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNoOfOccurencesOfAWord {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("F:\\inputfile.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferReader = new BufferedReader(fileReader);
	}

}
