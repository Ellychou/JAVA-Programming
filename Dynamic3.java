package test;
/**
 * CC 150 9.3
 * A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i. 
 * Given a sorted array of distinct integers, write a method to find a magic index,
 * if one exists, in array A.
 * 
 * Follow up: What if the elements are not distinct?
 * 
 * @author zhouhao
 *
 */
public class Dynamic3 {

	public static int findIndex(int[] array){
		
		for(int i = 0; i < array.length; i++){
			if(array[i] == i)
				return i;
		}
		
		return -1;
	}
	
	public static int findSort(int[] array,int left, int right){
		if(left > right || left < 0 || right > array.length - 1)
		return -1;
		
		int mid = (left + right)/2;
		
		if(array[mid] == mid)
			return mid;
		else if(array[mid] < mid)
			return findSort(array, mid + 1, right);
		else 
			return findSort(array, left, mid - 1);
	}
	
	public static int findSort(int[] array){
		return findSort(array, 0, array.length - 1);
	}

	public static int notDistinct(int[] array, int left, int right){
		if(left < 0 || right >= array.length || left >right)
			return -1;
		
		int midIndex = (left + right)/2;
		int midValue = array[midIndex];
		int min = Math.min(midIndex - 1, midValue);
		int max = Math.max(midIndex + 1, midValue);
		
		if (midIndex == midValue)
			return midIndex;
		int front = notDistinct(array, left, min);
		if (front >= 0)
			return front;
		else
			return notDistinct(array, max, right);	
	}
	
	public static int notDistinct( int[] array){
		return notDistinct(array, 0, array.length - 1);
	}
	
	
	public static void main(String[] args){
		int[] a = { -1,0,1,2,4,6};
		int[] b = {0,-1,6,4,2};
		int[] c = {1,3,5,7,9};
		int[] d = {-2, -1, 2, 2, 2, 3, 4, 7, 9, 12, 13};
		
		System.out.println(findIndex(b));
		System.out.println(findSort(a));
		System.out.println(findSort(c));
		System.out.println(notDistinct(d));
		
	}
}
