import java.util.*;

public class Coupon{

	public static double totalPrice(ArrayList<String> product){
		Boolean all = false;

		int total = 0;
		String first = "", second = "", third = "";

		for(int i = 0; i < product.size(); i++){
			if(product.get(i) == "A"){
				all = true;
				first = product.get(i);
			}else if(product.get(i) == "B"){
				second = product.get(i+1);
			}else if(product.get(i) == "C"){
			    third = product.get(i + 1);
			}else{
			int num = Integer.parseInt(product.get(i));
			total +=num;
			}
		}
		  int two = Integer.parseInt(second);
		  int three = Integer.parseInt(third);
		  
		double  temp = (double)total - two*0.2 -2;

		  if(all == true)
		  	temp *= 0.8;

		 return temp;

	}
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();
		a.add("20");
		a.add("A");
		a.add("B");
		a.add("30");
		a.add("5");
		a.add("C");
		a.add("7");

		System.out.println(totalPrice(a));

	}
}