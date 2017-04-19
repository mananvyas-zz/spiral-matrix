package main.java;
/**
 * Problem Definition: Display/Construct n*n matrix in Spiral Form
 * 
 * Input:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * Output:
 * 1 2 3
 * 8 9 4
 * 7 6 5
 */

public class SprialMatrixSolution {
	//Change input value to verify result
	static int input = 4;
	static int[][] matrix = new int[input][input];  
	static int counter = 1;

	public static void main(String args[]){
		SprialMatrixSolution.moveRightDown(0, -1, input);
		SprialMatrixSolution.displayMatrix();
	}


	public static void moveRightDown(int iStart, int jStart, int matrixSize){
		if(matrixSize > 0){
			for(int j=0;j<matrixSize;j++){
				jStart++;
				matrix[iStart][jStart] = counter;
				counter++; 
			}

			matrixSize--;

			for(int i=0;i<matrixSize;i++){
				iStart++;
				matrix[iStart][jStart] = counter;
				counter++;
			}

			SprialMatrixSolution.moveLeftUp(iStart, jStart, matrixSize);
		}
	}

	public static void moveLeftUp(int iStart, int jStart, int matrixSize){
		if(matrixSize > 0){
			for(int j=0;j<matrixSize;j++){
				jStart--;
				matrix[iStart][jStart] = counter;
				counter++;
			}

			matrixSize--;

			for(int i=0;i<matrixSize;i++){
				iStart--;
				matrix[iStart][jStart] = counter;
				counter++; 
			}

			SprialMatrixSolution.moveRightDown(iStart, jStart, matrixSize);
		}
	}

	public static void displayMatrix(){
		for(int i=0;i<input;i++){
			for(int j=0;j<input;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
