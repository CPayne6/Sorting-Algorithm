import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		String line = in.nextLine();
		String[] sArray = line.split(" ");
		int a[] = new int[sArray.length];
		for(int i = 0; i < sArray.length; i++){
			a[i] = Integer.parseInt(sArray[i]);
		}
		
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j;
			for(j = i-1; j >= 0 && temp < a[j]; j--){
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		
		for(int i: a){
			System.out.println(i);
		}
		
		in.close();
	}
	

}
