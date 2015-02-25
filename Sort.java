public class Sort {

    public static void main(String[] args) {
        //This code will sort the numbers in the array.
        //task: Modify the algorithm to reverse the sort, then comment on its efficiency in the space 		//provided below:
        //
        //This efficincy will be slow if the size of the array is very big. 
        //The run time is O(n*n) and the space complexity is O(n).
        //Mergesort or quicksort will be more efficient.
        //The run time for merge sort is nlogn, the memory requires n in worst case.
        //The average run time for quicksort is nlogn, the average memory is logn.
        //
        int[] unsorted = new int[100];
        for(int i = 0; i < 100; i++)
          unsorted[i] = (int)(Math.random()*100);
        System.out.println("Here are the unsorted numbers:");
        for(int i = 0; i < 100; i++) System.out.print(unsorted[i]+" ");
        System.out.println();
        int[] sorted = new int[100];
        for(int i = 0; i < 100; i++)
        {
          int hi = 101; // I have change hi from 1 to 101, so that all the numbers in the array are smaller than hi
          int hiIndex = -1;
          for(int j = 0; j < 100; j++)
          {
            if(unsorted[j] < hi) // Check the smallest number in the currently unsorted array
            {
              hi = unsorted[j];//Record the smallest number as hi
              hiIndex = j;//Record the index of the smallest number
            }
          }
          sorted[i] = hi;// Assign the smallest number to the sorted array
          unsorted[hiIndex] = 101;// Assign the checked smallest number as 101, so that it can find out the next smaller number in the unsorted array
        }
        System.out.println("Here are the sorted numbers:");
        for(int i = 0; i < 100; i++) System.out.print(sorted[i]+" ");
        System.out.println();
      }

}

