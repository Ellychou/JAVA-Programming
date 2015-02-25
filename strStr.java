public class strStr{
	
	public String needHay(String needle, String haystack){

		if(needle == null || haystack == null || needle.length() == 0){
			return haystack;
		}
		if(needle.length() > haystack.length()){
			return null;
		}
		

		for(int i = 0; i < haystack.length() - needle.length(); i++){
			Boolean subStr = true;
			
			for(int j = 0; j < needle.length(); j++){

				if(needle.charAt(j) != haystack.charAt(i+j)){
					subStr = false;
					break;
				} 	
			
			}

			if(subStr)
				return haystack.substring(i);

		}
		return null;
	}

	public static void main(String[] args){
		String h1 = "abcdefghijklmn";
		String n1 = "defghi";
		int m = 6;
		System.out.println(m>>1);
		

		strStr test1 = new strStr();
		String result1 = test1.needHay(n1,h1);
		//System.out.println(result1);
		
		String newString = h1.substring(0,4)+'a'+h1.substring(5,9);
		System.out.println(newString);

		
	}
}