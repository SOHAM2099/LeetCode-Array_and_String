class Solution {
    //SOHAM20999
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> row, prev=null;

        for(int i=0;i<numRows;i++)
        {
            row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)  row.add(1);
                else            row.add(prev.get(j-1)+prev.get(j));
            }
            prev=row;
            result.add(row);
        }
        return result;
    }
}