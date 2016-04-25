
public class SearchMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = {"butHole","hi","how are you?","zebra"};
		int[] intA={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(binSearch(intA,1));
	}

	public static int binSearch(String[] a, String val){
		int l = 0;
		int h = a.length-1;
		int m = 0;
		boolean found = false;
		while(l<h && !found){
			m=(l+h)/2;
			if(a[m].compareTo(val) < 0){
				l=m+1;
			}
			else if(a[m].compareTo(val) > 0){
				h=m-1;
			}
			else{
				found=true;
			}
		}

		if(found){
			return m;
		}
		else{
			return -1;
		}
	}
	
	public static int binSearch(int[] a, int val){
		int l = 0;
		int h = a.length-1;
		int m = 0;
		boolean found = false;
		while(l<=h && !found){
			m=(l+h)/2;
			if(a[m] < val){
				l=m+1;
			}
			else if(a[m] > val){
				h=m-1;
			}
			else{
				found=true;
			}
		}

		if(found){
			return m;
		}
		else{
			return -1;
		}
	}

}
