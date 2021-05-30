package java1_8features;

public class MultipleCatchBlocks_1_7 {

	public static void main(String[] args) {
		int i=8,j=2;
		int[] arr = {1,2,3,4};
		try {
			int result = i/j;
			System.out.println(arr[5]);
			System.out.println(result);
		}
		//If we have multiple catch blocks with same implementation, we can give exceptionsClasses 
		//in the single catch block separated by | (pipe) symbol.
		/*
		 * catch(ArithmeticException e ) { System.out.println("error"); }
		 * catch(ArrayIndexOutOfBoundsException e) { System.out.println("error"); }
		 */
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e ) {
			System.out.println("error"); 
		}
		finally {
			System.out.println("End of program");
		}
	}

}
