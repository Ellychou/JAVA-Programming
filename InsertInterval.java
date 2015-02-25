public class InsertInterval{
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){
		ArrayList<Interval> res = new ArrayList<Interval>();

		for(Interval i : intervals){
			if(i.end < newInterval.start){
				res.add(i);
			}else if(newInterval.end < i.start){
				res.add(newInterval);
				newInterval = i;
			}else{
				newInterval.start = Math.min(i.start, newInterval.start);
				newInterval.end = Math.max(i.end, newInterval.end);
			}
			
		}
		res.add(newInterval);

		return res;
	}
}

class Interval{
	int start;
	int end;
	Interval(){
		start = 0;
		end = 0;
	}
	Interval(int s, int e) {
		start = s;
		end = e;
	}
}