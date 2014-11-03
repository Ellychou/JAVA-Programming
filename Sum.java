import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Sum{
   
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();


        
        Arrays.sort(num);
        
        for(int i = 0; i < num.length - 2; i++){


            
            int j = i+1;
            int k = num.length - 1;
            
            while(j < k){
                if(num[i] + num[j] + num[k] > 0){
                    k--;
                }else if(num[i] + num[j] + num[k] < 0){
                    j++;
                }else{
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(num[i]);
                    temp.add(num[j]);
                    temp.add(num[k]);
                    result.add(temp);
                    j++;
                }

            }
        }


        return new ArrayList<ArrayList<Integer>>(result);
        
    }

    public static void main(String[] args){
        int[] num = {-6,-3,-1,0,1,1,2,3,4,5};
        int[] zero = {0,0,0,0};
        int[] three = {-1,0,1};
        int[] init = {0,0,0};

        ArrayList<ArrayList<Integer>> result = threeSum(zero);
        System.out.println(result.toString());

    }
}