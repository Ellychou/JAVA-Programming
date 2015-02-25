public class Stairs{

	public int climbStairs(int n){
		if(n <= 0){
			return 0;
		}

		if(n == 1){
			return 1;
		}

		if(n == 2){
			return 2;
		}

		return climbStairs(n-1) + climbStairs(n-2);

	}

	public int climb(int n){
		if(n<0){
			return 0;
		}
		int[] counts = new int[n+1];

		counts[0] = 1;
		counts[1] = 1;

		for(int i =2; i < n+1; i++){
			counts[i] = counts[i-1] + counts[i-2];
		}

		return counts[n];
	}
	

	public static void main(String[] args){
		int n = 44;

		Stairs countways = new Stairs();
		System.out.println(countways.climb(n));
	}
}