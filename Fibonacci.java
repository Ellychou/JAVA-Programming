public class Fibonacci {
	public int fibRercu (int num){
		if(num == 1 || num == 2) return 1;
		return fibRercu(num - 1)+ fibRercu(num-2);
	}

	public int fibLoop (int num) {
		if(num == 1 || num == 2) return 1;

		int fib1 = 1, fib2 = 1, fib = 1;
		for(int i = 3; i <= num; i++){
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
		}

		return fib;
	}

	public static void main(String args[]){
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fibRercu(7));
		System.out.println(fib.fibLoop(7));
	}
}