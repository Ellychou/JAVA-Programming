public class MergeSort{

	public static int[] Sort(int[] a){
		int middle = a.length/2;
		int[] low = new int[middle];
		int[] high = new int[a.length - middle];
		if(a.length == 1){
			return a;
		}else{
			
			for(int i=0; i < middle; i++)
				low[i] =  a[i]; // What does it mean?
			for(int i=middle; i < a.length; i++)
				high[i-middle] = a[i];
				
			int[] sortedL= Sort(low);
			int[] sortedH= Sort(high);
			return Merge(sortedL, sortedH);
		
		}
		
	}
	
	public static int[] Merge(int[] sortedL, int[] sortedH){
		int[] temp = new int[sortedL.length + sortedH.length];
		int l = 0, r = 0, i = 0;
		
		for( ; l < sortedL.length && r < sortedH.length; i++)
		{
			if (sortedL[l] < sortedH[r]){
				temp[i] = sortedL[l];
				l++;
			}else{
				temp[i] = sortedH[r];
				r++;
			}
		}
		
		while(l < sortedL.length){
			temp[i++] = sortedL[l++];
		}
		
		while(r < sortedH.length){
			temp[i++] = sortedH[r++];
		}
		
		return temp;
		

	}


	public static void main(String[] args){
		int[] b = new int[]{3,2,1,5,2,7,4};
		int[] c = Sort(b);
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]);
	}
	
	
}