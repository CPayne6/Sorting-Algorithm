import java.util.Arrays;

public class Utilities {

	public static int[] insertionSort(int[] a){
		
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j;
			for(j = i-1; j >= 0 && temp < a[j]; j--){
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		
		return a;
		
	}
	public static int[] mergeSort(int a[]){
		mergeSort(a,a.length-1,0);
		return a;
	}
	
	public static void mergeSort(int a[], int max, int min){
		if(max-min<2){
			if(a[max]<a[min]){
				int temp = a[min];
				a[min] = a[max];
				a[max] = temp;
			}
		}
		else{
			int mid = (max+min)/2;
			System.out.println(Arrays.toString(a));
			mergeSort(a,mid,min);
			mergeSort(a,max,mid+1);
			merge(a,min,mid,max);
		}
	}

	public static void merge(int[] a, int min, int mid, int max){
		int i = min;
		int j = mid+1;
		int tempCounter = 0;
		int temp[] = new int[max-min+1];
		while(i <= mid || j<=max){
			if(i>mid){
				temp[tempCounter]=a[j];
				j++;
			}
			else if(j>max){
				temp[tempCounter]=a[i];
				i++;
			}
			else{
				if(a[i]<a[j]){
					temp[tempCounter] = a[i];
					i++;
				}
				else if(a[i]>a[j]){
					temp[tempCounter] = a[j];
					j++;
				}
				else{
					temp[tempCounter] = a[j];
					tempCounter++;
					temp[tempCounter] = a[j];
					j++;
					i++;
				}
			}
			tempCounter++;

		}
		int counter=min;
		for(int c:temp){
			a[counter] = c;
			counter++;
		}
	}
	
	public static double[] makeRandomArray(int length, double max){
		double[] a = new double[length];
		
		for(int i = 0; i < a.length;i++){
			a[i] = Math.random() * max;
		}
		
		return a;
	}
	
	public static int[] selectionSort(int[] a){
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
		return a;
	}
	
	public static int[] bubbleSort(int[] a){
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
		
		return a;
	}
	
}
