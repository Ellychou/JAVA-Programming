/*
	11.3 Given a sorted array of n integers that has been rotated an unknown number of times, write code to find an element in the array. 
	     You may assume that the array was originally sorted in increasing order.
 */

 public class FindX{
	
	public static int findX(int[] a, int left, int right, int x){
		int mid;
		while(left <= right){
			mid = (left + right)/2;
			if (a[left] < a[mid]){
				if(x == a[mid]){
					return mid;
				}else if(x >= a[left] && x < a[mid]){
					right = mid - 1;
				}else{
					left = mid + 1;
				}
			}else if(a[mid] < a[left]){
				if(x == a[mid]){
					return mid;
				}else if(x > a[mid] && x <= a[right]){
					left = mid + 1;
				}else{
					right = mid - 1;
				}
			}else{

				if(a[mid] == a[right]){
					if(x == a[mid]){
						return mid;
					}else{
						left = left + 1;
						right = right - 1;
					}

				}else{
					if(x == a[mid]){
						return mid;
					}else{
						left= mid + 1;
					}
				}
			}

		}
		return -1;
	}


	public static void main(String[] args){
		int[] a = new int[]{15, 16, 19, 20, 25, 1, 5, 4, 5, 7, 10, 14};
		int[] c = new int[]{2,2,2,2,3,4,2};
		int b = findX(a, 0, 11, 5);
		int d = findX(c, 0, 6, 2 );

		System.out.println(b);
		System.out.println(d);
	}
	
}