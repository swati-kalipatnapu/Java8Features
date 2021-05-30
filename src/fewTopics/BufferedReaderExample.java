package fewTopics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//Input can be taken from the user using Scanner class
//and also using BufferedReader class
//WHAT data are you getting?
//from WHERE you're getting it?
//HOW you're getting it?
//before using bufferedreader, to pass an arg to the bufferReader use, inputStream to
//take the user input
public class BufferedReaderExample {
//If we don't give throws Exception in the main declaration, it will throw a CTE
//as Unhandled exception type IOException
	public static void main(String[] args) throws Exception{
		
		System.out.println("Enter a number: ");
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
	}

}
