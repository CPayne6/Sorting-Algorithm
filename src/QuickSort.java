import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		double a[] = {0,5,7,3,8,2,90,5,83,100,58,333,8,143};
		quickSort(a, 0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(double[] a, int from, int to){
		if(from>=to){
			return;
		}
		int p = (from+to)/2;
		int i = from;
		int j = to;
		
		while(i<=j){
			if(a[i] <= a[p]){
				i++;
			}
			else if(a[j] >= a[p]){
				j--;
			}
			else{
				swap(a,i,j);
				i++;
				j++;
				
			}
		}
		
		if(p < j){
			swap(a,j,p);
			p = j;
		}
		else if(p > i){
			swap(a,i,p);
			p = i;
		}
		
		quickSort(a, from, p-1);
		quickSort(a, p+1, to);
	}
	
	public static void swap(double[] a,int pos1,int pos2){
		double temp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = temp;
	}

}
