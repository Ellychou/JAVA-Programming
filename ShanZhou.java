public class ShanZhou{
	
	public static int[] BubbleSort(int[] a){
		int temp;
		
		for(int n=0; n<a.length; n++){
			for(int i=0; i < a.length-n-1; i++){
				if(a[i] > a[i+1]){
				temp= a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				}
			}
		}
		return a;
		}

	public static int foo(int n){
		if(n==0)
			return 1;
		else if(n<0)
			return 0;
		else
			return foo(n-1)+foo(n-2)+foo(n-3);
			
				
	}
	public static int fiber(int n){
		if(n==0 || n==1)
			return 1;
		else return fiber(n-2)+fiber(n-1);


	}
	public int[] selectionSort(int[] a){
		int temp;
		int temp2;
		for(int n=0; n<a.length; n++){
			temp = 0;
			for(int i=1; i < a.length-n; i++){
				if(a[temp] < a[i]){
					temp= i;
				}
			}
			temp2 = a[a.length-n-1];
			a[a.length-n-1] = a[temp];
			a[temp] = temp2;
		}
		return a;
	}

	public static void main(String[] args){
		int f = foo(2);
		System.out.println(f);
		int e = fiber(5);
		/*System.out.println(e);
		*/
		//TODO  
		int[] a = new int[]{1,3,2,9,4,3,8}; 
		int[] b = BubbleSort(a);
		/*
		for(int j=0; j<b.length; j++){
		System.out.println(b[j]);
		}
		*/
		ShanZhou c = new ShanZhou();
		int[] d = c.selectionSort(a);
		/*for(int j=0; j<d.length; j++){
			System.out.println(d[j]);
		}
		*/

	}
}