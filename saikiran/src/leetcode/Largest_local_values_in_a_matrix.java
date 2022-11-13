package leetcode;

public class Largest_local_values_in_a_matrix {

	public static void main(String[] args) {
		int arr[][]= {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		
		Largest_local_values_in_a_matrix_Solution1 obj =new  Largest_local_values_in_a_matrix_Solution1();
		int arr2[][]=obj.largestLocal(arr);
		
		for (int i=0;i<arr2.length;i++) {
			for (int j=0;j<arr2[0].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
class Largest_local_values_in_a_matrix_Solution1{
	public int [][] largestLocal(int [][] grid){
		int [][] arr=new int[grid.length-2][grid[0].length-2];
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=maxOfMatrix(i,j,i+3,j+3,grid);
			}
		}
		return arr;
	}
	
	public static int maxOfMatrix(int i,int j,int n,int m,int [][] grid) {
		int max=0;
		
		for (int x=i;x<n;x++) {
			for (int y=j;y<m;y++) {
				if (max<grid[x][y])
					max=grid[x][y];
			}
		}
		return max;
	}
}

class Largest_local_values_in_a_matrix_Solution2 {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] ans = new int[n-2][n-2];
        
        // Brute force
				// [i][j] represent top left corner
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max = -1;
                // run 3 rows and 3 columns
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        max = Math.max(max, grid[i+k][j+l]);
                    }
                }
                ans[i][j]=max;
            }
        }
        return ans;
    }
}
/**You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.

 

Example 1:


Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
Example 2:


Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
 

Constraints:

n == grid.length == grid[i].length
3 <= n <= 100
1 <= grid[i][j] <= 100
*/