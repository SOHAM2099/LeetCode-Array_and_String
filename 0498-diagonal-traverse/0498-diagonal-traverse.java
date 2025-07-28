class Solution {
    //SOHAM2099
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m=mat.length, n=mat[0].length;
        int[] result=new int[m*n];
        int x=0, y=0, index=0;
        boolean flip=true;

        result[index++]=mat[0][0];

        while(index<m*n)
        {
            if(flip)
            {
                y++;
                while(y!=0 && x!=m-1)
                {
                    if(y<n)
                        result[index++]=mat[x][y];
                    
                    y--;
                    x++;
                }
                result[index++]=mat[x][y];
                flip=false;
            }
            else
            {
                x++;
                while(x!=0 && y!=n-1)
                {
                    if(x<m)
                        result[index++]=mat[x][y];
                    
                    x--;
                    y++;
                }
                result[index++]=mat[x][y];
                flip=true;
            }
        }

        return result;
    }
}