import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("input.txt"));
		String[] s = (in.nextLine().split(" "));
		int[] a = new int[s.length];
		
		for(int i = 0; i< s.length; i ++){
			a[i] = Integer.parseInt(s[i]);
		}
		int temp;
		int counter = a.length-1;
		for(int i = 0; i < (a.length + 0.5)/2; i++){
			
			for(int j = 0; j < counter; j++){
				
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
			counter --;
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
