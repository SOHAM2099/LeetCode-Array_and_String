class Solution {
    //SOHAM2099
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();

        int m=matrix.length, n=matrix[0].length;
        int up=0, left=0, down=m-1, right=n-1;

        while(up<=down && left<=right)
        {
            for(int i=left;i<=right;i++)    result.add(matrix[up][i]);
            for(int j=up+1;j<=down;j++)     result.add(matrix[j][right]);
            if(up!=down)
                for(int i=right-1;i>=left;i--)   result.add(matrix[down][i]);
            if(left!=right)
                for(int j=down-1;j>up;j--)     result.add(matrix[j][left]);

            up++; down--; left++; right--;
        }
        return result;
    }
}