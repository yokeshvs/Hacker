package com.interview.amazon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FirstNonRepeatingWord {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Yokesh\\Documents\\workspace\\apps\\files\\myfile.txt";
		BufferedReader bufferedReader = null;
		Scanner scanner = null;
		try {
			Stream<String> stream = Files.lines(Paths.get(fileName));
			stream.forEach(System.out::println);
			
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String currentLine;
			while((currentLine = bufferedReader.readLine()) != null) {
				System.out.println(currentLine);
			}
			
			scanner = new Scanner(new File(fileName));
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			
			List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			System.out.println(lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
