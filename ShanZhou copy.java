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

	public static void main(String[] args){
		//TODO  
		int[] a = new int[]{1,3,2,9,4,3,8}; 
		int[] b = BubbleSort(a);
		for(int j=0; j<b.length; j++){
		System.out.println(b[j]);
		}
		}
}