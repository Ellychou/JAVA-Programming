import java.util.*;

public class CompareVersion {
	public static int compareVersion(String version1, String version2) {
		ArrayList<Integer> v1 = change(version1);
		ArrayList<Integer> v2 = change(version2);

		int l = v1.size() < v2.size() ? v1.size():v2.size();
		for (int i = 0; i < l; i++) {
			int  res = v1.get(i).compareTo(v2.get(i));
			if(res != 0) return res;
		}
		if(v1.size() > v2.size()) return 1;
		else if(v1.size() < v2.size()) return -1;
		else return 0;
	}
	public static ArrayList<Integer> change(String version) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] arr = version.split("\\.");

		for(int i = 0; i < arr.length; i++){
			list.add(Integer.valueOf(arr[i]));
		}

		return list;
	}

	public static int compareVersion2(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");

		
		int length = Math.max(v1.length, v2.length);
		for (int i = 0; i < length; i++) {
			Integer l1 = i < v1.length? Integer.valueOf(v1[i]):0;
			Integer l2 = i < v2.length? Integer.valueOf(v2[i]):0;
			int compare = l1.compareTo(l2);
			if(compare != 0) return compare;
		}
		return 0;
	}


	public static void main(String[] args) {
		String v1 = "1";
		String v2 = "0";
		int a = compareVersion2(v1,v2);

		System.out.println(a);


		//System.out.println("2" + compareVersion2(v1,v2));

	}
}