
public class Test2 {
	public static int pixelValue(int [] input1,int [] input2) 
  {
	//int matrixDef [] = {7,0,3,1,1,0,1,1};
	//int [] input1 = {51,101};
	//int [] matrixDef = {191,0,2,1,97,0,4,1,4,0,2,1,92,0,3,1,98,0,3,1,3,0,3,1,92,0,3,1,3,0,3,1,78,0,8,1,11,0,4,1,77,0,9,1,13,0,1,1,78,0,9,1,7,0,4,1,82,0,8,1,7,0,5,1,81,0,8,1,7,0,2,1,1,0,2,1,80,0,8,1,8,0,5,1,81,0,7,1,7,0,5,1,85,0,1,1,1,0,2,1,99,0,3,1,91,0,9,1,91,0,10,1,93,0,5,1,1,0,2,1,93,0,8,1,93,0,8,1,92,0,9,1,95,0,7,1,94,0,6,1,94,0,7,1,91,0,10,1,92,0,8,1,94,0,1,1,2,0,3,1,94,0,1,1,2350,0};
	//int rows = 51;
	//int cols = 101;
	int rows = input1[0];
	int cols = input1[1];
	int [] matrixDef = input2;
	int row_index=0;
	int col_index = 0;
	
	int [][] matrix = new int[rows][cols];
	for(int i = 0;i<matrixDef.length;i++)
	{
		int nums = matrixDef[i];
		int pixel = matrixDef[i+1];
		i+=1;
			for(int z=nums ;z>0;z--)
				{
					matrix[row_index][col_index] = pixel;
					col_index +=1;
					if(col_index == cols) {col_index =0;row_index=row_index+1;}
				}
				
		}		
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++)
			System.out.print(matrix[i][j]);
		System.out.println();
	}
	
	
	int [][] A = matrix;
	int cnt = 0; 
	int cur_cnt = 0;
	for(int x=0; x<A.length; x++) {
  	  for(int y=0; y<A[x].length; y++) {
  		 if (A[x][y] == 1) {
  			cur_cnt = 1;  
  			cnt = cnt + matrixCheck(A,x,y, cur_cnt); 	 
  		 }
  	  }
  	}
  	
  	System.out.println(cnt);
  	return cnt;
	}
  

public static int matrixCheck(int[][] A, int xdir, int ydir, int cur_cnt) { 
	A[xdir][ydir] = 0;
	if (validMove(xdir-1,ydir  , A.length, A[0].length) == 1 && A[xdir-1][ydir  ] == 1) {matrixCheck(A,xdir-1,ydir  ,cur_cnt); cur_cnt = 1;}
	if (validMove(xdir+1,ydir  , A.length, A[0].length) == 1 && A[xdir+1][ydir  ] == 1) {matrixCheck(A,xdir+1,ydir  ,cur_cnt); cur_cnt = 1;}
	if (validMove(xdir  ,ydir-1, A.length, A[0].length) == 1 && A[xdir  ][ydir-1] == 1) {matrixCheck(A,xdir  ,ydir-1,cur_cnt); cur_cnt = 1;}
	if (validMove(xdir  ,ydir+1, A.length, A[0].length) == 1 && A[xdir  ][ydir+1] == 1) {matrixCheck(A,xdir  ,ydir+1,cur_cnt); cur_cnt = 1;}
    
	return cur_cnt;
}

public static int validMove(int xdir, int ydir, int x_moves_left, int ymovesright) {
	if (xdir >= 0 && xdir <= (x_moves_left-1) && ydir >= 0 && ydir <= (ymovesright-1)) {
		return 1;
	}
	else
	{
		return 0;
	}

}
public static void main(String args[])
{
	  int [] input1 = {51,101};
	  int [] input2 = {191,0,2,1,97,0,4,1,4,0,2,1,92,0,3,1,98,0,3,1,3,0,3,1,92,0,3,1,3,0,3,1,78,0,8,1,11,0,4,1,77,0,9,1,13,0,1,1,78,0,9,1,7,0,4,1,82,0,8,1,7,0,5,1,81,0,8,1,7,0,2,1,1,0,2,1,80,0,8,1,8,0,5,1,81,0,7,1,7,0,5,1,85,0,1,1,1,0,2,1,99,0,3,1,91,0,9,1,91,0,10,1,93,0,5,1,1,0,2,1,93,0,8,1,93,0,8,1,92,0,9,1,95,0,7,1,94,0,6,1,94,0,7,1,91,0,10,1,92,0,8,1,94,0,1,1,2,0,3,1,94,0,1,1,2350,0};
	 //int [] input1 =  {2,6};int [] input2 = {7,0,3,1,1,0,1,1};
	 int r = pixelValue(input1,input2);
	  System.out.println(r);
}
}
