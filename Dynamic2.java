/**
 * 
 */
package test;

/**
 * CC150 9.2
 * Imagine a robot sitting on the upper left corner of an X by y grid. 
 * The robot can only move in two directions:rigth and down.
 * How many possible paths are there for the robot to go from (0,0) to (X,Y)?
 * 
 
 * @author shanzhou
 *
 */
public class Dynamic2 {
	
	private static int[][] temp;
	
	public Dynamic2(int x, int y){
		temp = new int[x+1][y+1];	
	}
	
	public static int myCount(int x, int y){
		if (x < 0 || y < 0)
			return 0;
		else if(x == 0 || y == 0)
			return 1;
		else if (temp[x][y] != 0)
			return temp[x][y];
		else
			temp[x][y] = myCount(x - 1, y) + myCount(x, y - 1);
		return temp[x][y];
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(myCount(2,1));
		System.out.println(myCount(3,3));
		
		

	}

}
