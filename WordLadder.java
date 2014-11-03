import java.util.*;


public class WordLadder {
	public static int ladderLength(String start, String end, HashSet<String> dict) {
		if(start == null || end == null || dict.size() == 0 || start.length() == 0 || end.length()== 0|| start.length()!= end.length())
			return 0;

		Queue<String> queue = new LinkedList<String>();
		HashSet<String> visited = new HashSet<String>();

		int level = 1;
		int qNum = 1;
		int currNum = 0;

		queue.offer(start);
		visited.add(start);

		while(!queue.isEmpty()){

			String word = queue.poll();
			qNum--;

			for(int i = 0; i < start.length(); i++){
				char[] temp = word.toCharArray();
				for(char c='a'; c<='z'; c++){
					temp[i] = c;
					String tempStr = new String(temp);
					if(tempStr.equals(end))
						return level+1;
					if(dict.contains(tempStr) && !visited.contains(tempStr)){
						queue.offer(tempStr);
						visited.add(tempStr);
						currNum++;
					}
				}
			}

			if(qNum == 0){
				qNum = currNum;
				currNum = 0;
				level++;
			}

		}

		return 0;
	}

	public static void main(String[] args){

	}
}