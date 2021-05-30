package java1_8features;

public class VarArgs {
	int i;
	public int add(int ... i) {
		int sum = 0;
		for(int k : i) {
			sum+=k;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		//If you give how many numbers as args, add method accepts it as we have used var-args
		System.out.println("Sum is: "+v.add(1,2,3,4));
		System.out.println("Sum is: "+v.add(1,2,4));
		System.out.println("Sum is: "+v.add(1,4));
		
	}

}
