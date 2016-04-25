import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		String[] s = (in.nextLine().split(" "));
		int[] a = new int[s.length];
		
		for(int i = 0; i< s.length; i ++){
			a[i] = Integer.parseInt(s[i]);
		}
		int l = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = i; j < a.length; j++){
				
				if(a[j]<a[l]){
					l=j;
				}
				
			}
			int temp = a[l];
			a[l] = a[i];
			a[i] = temp;
		}
		
		System.out.println(printArray(a));
		in.close();

	}

	public static String printArray(int[] a){
		String returnVal = "";
		
		for(int i = 0; i < a.length; i++){
			returnVal+= a[i]+" ";
		}
		
		return returnVal;
	}
	
}
