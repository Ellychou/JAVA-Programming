package test;

import java.util.ArrayList;

/**
 * cc150 9.4
 * Write a method to return all subsets of a set
 *
 * @author shan zhou
 *
 */
public class Dynamic4 {
	
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer>set,int index){
		
		
		if (set.size() == index){
			ArrayList<ArrayList<Integer>> allSub = new ArrayList<ArrayList<Integer>>();
			allSub.add(new ArrayList<Integer>());
			return allSub;
		}
	
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> subSet= getSubsets(set, index + 1);
			ArrayList<ArrayList<Integer>> newSets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> sub: subSet){
				ArrayList<Integer> newSet = new ArrayList<Integer>();
				newSet.addAll(sub);
				newSet.add(item);
				newSets.add(newSet);
			}
		subSet.addAll(newSets);
		
		return subSet;
		
		
	}
			
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(0);
		a.add(4);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		System.out.println(getSubsets(a,0));
		System.out.println(getSubsets(b,0));
	}
	

}
