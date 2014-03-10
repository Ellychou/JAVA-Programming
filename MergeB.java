 /**
  *Merge sorted array a into sorted array b
  * 
  */
 public class MergeB{
 	
 	public static int[] Merge(int[] a, int[] b, int m, int n){
 		int i = m-1;
 		int j = n-1;
 		while (i >= 0){
 			if(j >= 0){
	 			if (a[i] >= b[j]){
	 				b[i+j+1] = a[i];
	 				i--;
	 			}else{
	 				b[i+j+1] = b[j];
	 				j--;
	 			}
	 			System.out.print(j + ",");
 			}else{ 
 				System.out.print(j + " ");
 				b[i+j-1] = a[i--];
 			}
 		}
 		return b;
 	}
 	
 	public static void main(String[] args){
 		int[] a = new int[]{1,1,1};
 		int[] b = new int[9];
 		for(int i = 0; i < 6; i++){
 			b[i] = 2*i+2;
 		}
 		//System.out.println(b.length);
 		int[] c = Merge(a,b,3,6);
 		for(int i=0; i< c.length; i++)
 			System.out.println(c[i]);
 		
 		
 	}
 
 }