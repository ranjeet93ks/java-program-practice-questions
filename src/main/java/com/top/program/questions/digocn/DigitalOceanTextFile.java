package com.top.program.questions.digocn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DigitalOceanTextFile {

	public static void main(String[] args) {
		try {
			System.out.println(findStringInFile(
					"D:\\MyWorks\\Java-SpringBoot-Microservices\\java-program-practice-questions\\sample.txt",
					"Ranjeet"));// true but not able to read pdf
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

//search a string in text file
	public static boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		// read the file line by line
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains(str)) {
				scanner.close();
				return true;
			}
		}
		scanner.close();
		return false;
	}

}
