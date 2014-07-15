package test;
/**
 * CC 150 9.1
 * A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time,
 * implement a method to count how many possible ways the child can run up the stairs.
 * 
 * There are 3 methods to figure out this problem.
 * @author shan 
 *
 */
public class Dynamic {

	public static int CountStaris(int n){
		if(n < 0){
			return 0;
		}else if(n == 0){
			return 1;
		}else{
			return CountStaris(n - 1) + CountStaris(n-2) + CountStaris(n-3);
		}
	}
	
	public static int countDynamic(int n){
		int[] temp = new int[n + 1];
		return countDynamic(n,temp);
	}
	
	public static int countDynamic(int n, int[] temp){
		if(n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n ==2 )
			return 2;
		else if (n == 3)
			return 4;
		else if (temp[n] != 0)
			return temp[n];
		else
			temp[n] = countDynamic(n-1) + countDynamic(n-2) + countDynamic(n-3);
		return temp[n];
				
	}
	
	public static int countSimplest(int n, int[] temp){
		if(n < 0)
			return 0;
		else if (n == 0)
			return 1;
		else if (temp[n] >-1) 
			return temp[n];
		else
			temp[n] = countSimplest(n - 1, temp) + countSimplest(n - 2, temp) + countSimplest(n - 3, temp);
		return temp[n];
	}
	
	
	public static void main (String[] args){
		System.out.println(CountStaris(5));
		System.out.println(countDynamic(7));

		
	}
}
