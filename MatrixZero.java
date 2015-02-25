public class MatrixZero {
	public static void setZeroes(int[][] matrix){
		int row = matrix.length;
		int col = matrix[0].length;

		Boolean rowZero = false;
		Boolean colZero = false;

		for(int i = 0; i < row; i++){
			if(matrix[i][0] == 0)
				rowZero = true;
		}

		for(int j = 0; j < col; j++){
			if(matrix[0][j] == 0){
				colZero = true;
			}
		}
		
		for(int i = 1; i < row; i++){
			for(int j = 1; j < col; j++){
				if(matrix[i][j] == 0){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}

			}
		}
		for(int i = 1; i < row; i++){
			if(matrix[i][0] == 0){
				for(int j = 1; j < col; j++){
					matrix[i][j] = 0;
				}
			}
		}

		for(int j = 1; j < col; j++){
			if(matrix[0][j] == 0){
				for(int i = 1; i < row; i++){
					matrix[i][j] = 0;
				}
			}
		}

		if(rowZero){
			for(int i = 0; i < row; i++){
				matrix[i][0] = 0;
			}
		}

		if(colZero){
			for(int j = 0; j < col; j++){
				matrix[0][j] = 0;
			}
		}
	}

	public static void main(String[] args){
		int[][] matrix = {{0,0,0,5},
							{4,3,2,4},
							{0,1,1,4},
							{1,2,1,3},
							{0,0,1,1}};

	}
}