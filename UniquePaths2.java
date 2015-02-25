public class UniquePaths2 {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0 ) return 0;


		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;

		if(m == 1 || n == 1) return 1;

		for(int i = 0; i < m; i++) {
			if(obstacleGrid[i][0] == 0){
				path[i][0] = 1;
			}else{
				path[i][0] = 0;
				break;
			}
		}
		for(int i = 0; i < n; i++) {
			if(obstacleGrid[0][i] == 0){
				path[0][i] = 1;
			}else{
				path[0][i] = 0;
				break;
			}
		}
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++){
				if(obstacleGrid[i][j] == 0){
					path[i][j] = path[i][j-1] + path[i-1][j];
				}else{
					path[i][j] = 0;
					//break;
				}
			}
		}
		return path[m-1][n-1];
	}
		

	public static void main(String[] args) {
		int[][] b = {{0,0,0},{0,1,0},{0,0,0}};
		int[][] c = {{0,0}};
		int[][] a = {{0,0,0,0,0},{0,0,0,0,1},{0,0,0,1,0},{0,0,0,0,0}};
	
		System.out.println(uniquePathsWithObstacles(a));

	}
}