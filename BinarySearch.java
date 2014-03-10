public class BinarySearch{
	
	public static int[] Search(int[] a, int x){
		int low = 0;
		int high = a.length-1;
		
		
		while(low < high){
			int middle = (low + high)/2;
			if(a[middle] < x){
				low = middle + 1;
			}else if(a[middle] > x){
				high = middle - 1;
			}else{
				return middle;
			}
			
		}
		
		return -1; 
	}
}