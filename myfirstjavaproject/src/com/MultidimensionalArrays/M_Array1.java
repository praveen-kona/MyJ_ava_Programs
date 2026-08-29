package com.MultidimensionalArrays;

public class M_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		  
		for(int i=0;i<matrix.length;i+=2)
		{
			int start=0;
			int end=matrix[i].length-1;
			while(start<end) 
			{
				int temp=matrix[i][start];
				matrix[i][start]=matrix[i][end];
				matrix[i][end]=temp;
				start++;
				end--;
			}
		}
		for(int j=0;j<matrix[1].length;j++)
		{
			if(j!=1)
				matrix[1][j]=matrix[1][j]*2;
		}
		for(int i=0;i<matrix.length;i++)
		{
			matrix[i][i]*=matrix[i][i];
		}
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
