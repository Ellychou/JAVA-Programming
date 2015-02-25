public class Exetreme {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return -1;
        }
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }
        float average =1.0f * total/A.length;
        int extremeIndex = 0;
        float extremeElement = Math.abs(A[0]-average);
        System.out.println(average);
        for ( int i = 1; i < A.length; i++) {
            if (Math.abs(A[i]-average) > extremeElement) {
                extremeIndex = i;
                extremeElement = Math.abs(A[i]-average);
            }
        }
        return extremeIndex;
    }  

    public static void main(String[] args) {
        int[] a = {8,4,-3,-2,2,3,1};
        System.out.println(solution(a));

    } 
}