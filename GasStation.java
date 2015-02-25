public class GasStation {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas == null || cost == null || gas.length == 0 || cost.length == 0 || gas.length != cost.length) 
			return -1;

		int total = 0, start = 0, remain = 0, sum = 0;
		for (int i = 0; i < gas.length; i++) {
			remain = gas[i] - cost[i];
			if (sum >= 0) {
				sum += remain;
			}else{
				start = i;
				sum = remain;
			}
			total += remain;
			System.out.println("start = "+ start);
			System.out.println("sum = "+ sum);

		}
		if(total < 0) {
			return -1;
		}else{
			return start;
		}      
    }
    public static void main(String[] args) {
    	int[] gas = {1,2,4,3};
    	int[] cost = {4,1,1,5};
    	System.out.println(canCompleteCircuit(gas,cost));
    }
}