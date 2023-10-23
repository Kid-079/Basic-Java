package com.inputOutput;

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// BUFFERED BYTE STREAM
		long timeStart, timeFinish;

		// Read From File
		FileInputStream byteInput = new FileInputStream("input.txt");
		System.out.println(byteInput.available());
		System.out.println();

		// Count time from file
		timeStart = System.nanoTime();
		System.out.println(byteInput.readAllBytes());
		timeFinish = System.nanoTime();
		System.out.println("Time : " + (timeFinish - timeStart));
		byteInput.close();
		System.out.println();


		// Read From Memory
		FileInputStream byteInput2 = new FileInputStream("input.txt");
		BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

		bufferedInput.mark(200);

		// Count Time From Memory
		timeStart = System.nanoTime();
		System.out.println(bufferedInput.readAllBytes());
		timeFinish = System.nanoTime();
		System.out.println("Time : " + (timeFinish - timeStart));
		System.out.println();


		// Read Data
		bufferedInput.reset();
		byte[] data = bufferedInput.readAllBytes();
		// data byteStream
		System.out.println(Arrays.toString(data));
		// data String
		String dataString = new String(data);
		System.out.println(dataString);
		bufferedInput.close();
		byteInput2.close();

		// Write with Buffered Output
		// from input.txt ---> output.txt
		FileOutputStream byteOutput = new FileOutputStream("output.txt");
		BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

		// Write data byte
		bufferedOutput.write(data,0,data.length);
		bufferedOutput.flush();

		bufferedOutput.close();
		byteOutput.close();
	}
}

// If use Character International(Japan, Korea, Arab, China, etc) use FileReader or FileWriter