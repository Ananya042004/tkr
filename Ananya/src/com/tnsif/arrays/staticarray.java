package com.tnsif.arrays;

public class staticarray {

	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print((int)(Math.random()*100)+" ");
			}
			System.out.println();
		}

	}

}
