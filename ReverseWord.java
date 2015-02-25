public class ReverseWord {
	public static String reverseWords(String s) {
  s = s.trim();
        if(s == null || s.length() == 0 || s == " ") return "";
		String[] arr = s.split(" ");
		if(arr.length == 0) return "";
		StringBuffer buf = new StringBuffer();
		for(int i = arr.length - 1; i>=0; i--){
		    if(arr[i].trim().equals("")) continue;
			buf.append(arr[i]).append(' ');
		}
		
		//buf.setLength(buf.length() - 1);
		buf.delete(buf.length() - 1,buf.length());
		return buf.length() == 0 ? "" : buf.toString();
    
	}

	public static void main(String[] args) {
		System.out.println(reverseWords(" hi "));

	}
}