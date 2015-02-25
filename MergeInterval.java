import java.util.*;

public class MergeInterval{
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals){
		ArrayList<Interval> res = new ArrayList<Interval>();

		if(intervals.size() == 0){
			return res;
		}

		Collections.sort(intervals, new Comparator<Interval>(){
			@Override
			public int compare(Interval i1, Interval i2){
				return i1.start - i2.start;
			}
		});

		Interval first = intervals.get(0);
		for(int i = 1; i < intervals.size(); i++){
			Interval second = intervals.get(i);
			if(first.end < second.start){
				res.add(first);
				first = second;
			}else{
				Interval merged = new Interval(first.start,Math.max(first.end, second.end)); 
				first = merged;
			}
			
		}
		res.add(first);
		return res;
	}

	public static void main(String[] args){
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(15,18));

		ArrayList<Interval> res = merge(intervals);
		for(int i = 0; i < res.size(); i++){
			System.out.println(res.get(i));
		}

	}
}

class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0;}
	Interval(int s, int e) { start = s; end = e;}
}