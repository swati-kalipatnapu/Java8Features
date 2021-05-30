package java1_8features;

import java.io.*;

public class TryWithResource {

	public static void main(String[] args) throws Exception {
	
		
		int n = 0;
		//BufferedReader b = null;
		System.out.println("Enter n: ");
		/*try {
			
			 * InputStreamReader i = new InputStreamReader(System.in); b = new
			 * BufferedReader(i);
			 
			//Abovecode can also be written as below:
			b = new BufferedReader( new InputStreamReader(System.in));
			n = Integer.parseInt(b.readLine());
		}*/
		
		try(BufferedReader b =new  BufferedReader( new InputStreamReader(System.in));){
			n = Integer.parseInt(b.readLine());
		}
		//Finally is not required when we use try with resources
		/*
		 * finally {
		 * 
		 * b.close(); }
		 */
		System.out.println(n);
	}

}
