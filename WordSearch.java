public class WordSearch{
	private int row;
	private int col;
    public boolean exist(char[][] board, String word) {
    	row = board.length;
    	col = board[0].length;
    	boolean[][] visited = new boolean[row][col];

    	for(int i = 0; i < row; i++){
    		for(int j = 0; j < col; j++){
    			if(dfs(board,word, 0, i, j,visited))
    				return true;
    		}
    	}
    	return false;    
    }

    private boolean dfs(char[][] board, String word, int index, int i, int j, boolean[][] visited){
    	if(index == word.length())
    		return true;
    	if(i < 0 || j < 0 || i >= row || j >= col)
    		return false;
    	if(visited[i][j])
    		return false;
    	if(board[i][j] != word.charAt(index))
    		return false;

    	visited[i][j] = true;
    	boolean res = dfs(board, word, index+1, i+1, j, visited)||
    					dfs(board, word, index+1, i-1, j, visited)||
    					dfs(board, word, index+1, i, j+1, visited)||
    					dfs(board, word, index+1, i, j-1, visited);
    	visited[i][j] = false;

    	return res;	
    }

}