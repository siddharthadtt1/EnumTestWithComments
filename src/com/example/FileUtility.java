package com.example;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;

public class FileUtility {

	public static void startFileReading(String fileName) {
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
