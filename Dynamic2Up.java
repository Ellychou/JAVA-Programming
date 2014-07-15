/**
 * 
 */
package test;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Dynamic2 Follow Up
 * Imagine certain spots are "off limits", such that the robot can not step on them.
 * Design an algorithm to find a path for the robot from the top left to the bottom right.
 * 
 * @author shan zhou
 *
 */
public class Dynamic2Up {
	public static int[][] temp;
	//public static ArrayList<Point> off;
	
	public Dynamic2Up(int x, int y){
		temp = new int [x+1][y+1];
		//off = new ArrayList<Point>();
	}

	public static Boolean findPath(int x, int y){
		Hashtable<Point,Boolean> myHash = new Hashtable<Point, Boolean>();
		return findPath(x, y,myHash);	
	}
	
	public static Boolean findPath(int x, int y, Hashtable<Point, Boolean> myHash){
		if (x < 0 || y < 0 || temp[x][y] == -1)
			return false;
		else if(x == 0 && y == 0)
			return true;
		else if (myHash.containsKey(new Point(x,y)))
			return myHash.get(new Point(x,y));
		else {
			if(findPath(x-1,y,myHash)){
				myHash.put(new Point(x-1,y), true);
				//off.add(new Point(x-1,y));
				return true;
			}else{ 
				myHash.put(new Point(x-1,y), false);
			}
			
			if(findPath(x,y-1,myHash)){
				myHash.put(new Point(x,y-1), true);
				//off.add(new Point(x,y-1));
				return true;
			}else{
				myHash.put(new Point(x,y-1), false);
			}
				return false;
			}
		}

	
	public static void main(String[] args) {
		Hashtable<Point,Boolean> myHash = new Hashtable<Point, Boolean>();
		Point a = new Point(1,1);
		myHash.put(a, false);
		
		System.out.println(findPath(3, 3,myHash));
		
		
		

	}

}
