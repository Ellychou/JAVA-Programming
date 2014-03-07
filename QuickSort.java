public class QuickSort{
	
	public static int[] Sort(int[] a, int left, int right){
		int pivot = partition(a, left, right);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		if(left < pivot-1)  Sort(a, left, pivot-1);
		if(pivot+1 < right)  Sort(a, pivot+1, right);
		/*
		if(left == 0 && right == a.length-1){
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		}
		*/
		return a;
		
	}
	
	
	public static int partition(int[] a, int left, int right){
		int temp;
		int middle = (left+right)/2;
		while(left <= right) {
			
			// Now, check wether the left index number is great than middle
			while(a[left] < a[middle]) left++;
			while(a[right] > a[middle] )right--;
			
			//so if the a[left] > a[middle], need to swap the left one to the right? Yes, but do swap here, after finding the left & right
			// swap here
			
			// step 1: check whether left < right, you'd know how to deal with this
			if(left <= right) {
				// step 2: swap number of left & right
				temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			//Honey, I love you, that's all :-) love u too, go on, and follow my steps I provided to you
		}
		
		return left;
	}
	
	public static void main(String[] args){
		int[] a = new int[]{1,2,4,6,2,7,8,3,9};
		int[] b = Sort(a, 0, a.length-1);
		//for(int i = 0; i < b.length; i++)
		//	System.out.println(b[i]);
 	}
}