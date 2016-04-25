import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] a = {6,9,1,7,6,4,9,1,0,9,8,7,6,9,3,8,5,7};
		//merge(a,0,(a.length-1)/2,a.length-1);
		mergeSort(a,a.length-1,0);
		System.out.println(Arrays.toString(a));
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
}
