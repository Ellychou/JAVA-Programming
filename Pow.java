public class Pow{

	public double pow(double x, int n) {



		if(x == 0)
			return 0;
		if(n == 0)
			return 1;
		if(n == 1)
			return x;
		if(n < 0){
			n = -n;
			x = 1./x;
		}
		
		double temp = pow(x,n/2);
			
		return n%2==0?temp*temp:temp*temp*x;
		

	}

	public static void main(String[] args){
		double x = 8;
		int n = 3;

		Pow test = new Pow();
		double res = test.pow(x,n);
		System.out.println(res);
	}
}