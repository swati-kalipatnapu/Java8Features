/*
 * $$$$
   $  $
   $  $ 
   $$$$ 
 */
package patterns;

public class Pattern4 {

	public static void main(String[] args) {
		byte n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n ||j==1 ||j==n )
					System.out.print("$");
				else  { 
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
