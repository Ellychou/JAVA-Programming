public class Replace{
	public static int fibonacci(int num){

		int fib1 = 0, fib2 = 1, fib = 1;
		if(num == 1)
			return 1;
		if(num == 2)
			return 1;


		for(int i = 3; i < num; i++){

			fib = fib1 + fib2;

			fib1 = fib2;
			fib2 = fib;

			//System.out.println(fib);

	
		}
		return fib;

	}

	public static int fib(int num){

		if(num == 1 || num == 2)
			return 1;

		return fib(num-1) + fib(num-2);
	}

	public static void main(String[] args){

		fibonacci(9);

		for(int i = 1; i <= 9; i++){
			//System.out.println(fib(i) + " ");
		}

		for(int i = 1; i <= 50; i++){

			if(i%3 == 0 && i%5 ==0){
				System.out.println("FB");
			}else if(i%3 == 0){
				System.out.println("F");
			}else if(i%5 == 0){
				System.out.println("B");
			}else{
				System.out.println(i);
			}
			
		}
	}

	
}