import java.util.Scanner;

public class MakeArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("how big would you like the array??");
		int length = in.nextInt();
		
		System.out.println("what is the maximum value in the array??");
		double max = in.nextDouble();
		
		makeRandomArray(length,max);
		
		
	}
	
	
	public static double[] makeRandomArray(int length, double max){
		double[] a = new double[length];
		
		for(int i = 0; i < a.length;i++){
			a[i] = Math.random() * max;
		}
		
		return a;
	}

}
