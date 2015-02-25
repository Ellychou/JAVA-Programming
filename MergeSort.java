public class MergeSort {
	public static void mergeSort(String[] arr) {
		if (arr.length < 2) return;

		String[] left = new String[arr.length/2];
		String[] right = new String[arr.length - arr.length/2];
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[i+arr.length/2];
		}
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}

	public static void merge(String[] arr, String[] left, String[] right) {
		int l = 0;
		int r = 0;

		for (int i = 0; i < arr.length; i++) {
			if (r >= right.length || (l < left.length && left[l].compareToIgnoreCase(right[r]) <= 0)) {
				arr[i] = left[l];
				l++;
			} else {
				arr[i] = right[r];
				r++;
			}
		}
	}

	public static void main(String[] args) {
		String[] a = {"djiu","adf","uw","kojw","abs"};
		mergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}