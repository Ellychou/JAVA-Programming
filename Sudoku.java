import java.util.*;

public class Sudoku {
	public boolean isValidSudoku(char[][] board) {
		int row = board.length;
		int col = board[0].length;
		if(board == null || row == 0)
			return false;
		HashMap<Character,Boolean> rowMap= new HashMap<Character,Boolean>();
		HashMap<Character,Boolean> colMap = new HashMap<Character,Boolean>();
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(board[i][j] != '.'){
					if(rowMap.containsKey(board[i][j])){
						return false;
					}else{
						rowMap.put(board[i][j],true);
					}
				}
				if(board[j][i] != '.'){
					if(rowMap.containsKey(board[j][i])){
						return false;
					}else{
						rowMap.put(board[j][i],true);
					}

				}
			}
			rowMap.clear();
			colMap.clear();
		}
		HashMap<Character,Boolean> block = new HashMap<Character,Boolean>();
		int[] temp = {0,3,6,9};
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3;i++){
			    block.clear();
				for(int n = temp[i]; n < temp[i+1]; n++){
					for(int m = temp[j]; m < temp[j+1]; m++){
						if(board[n][m] != '.'){
							if(block.containsKey(board[n][m])){
								return false;
							}else{
								block.put(board[n][m],true);
							}
						}
					}
				}


			}
		}


		return true;
	}

}