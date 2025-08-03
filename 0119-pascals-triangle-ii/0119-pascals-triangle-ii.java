class Solution {
    //SOHAM2099
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev=null;
        List<Integer> row=null;
        for(int i=0;i<rowIndex+1;i++)
        {
            row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)  row.add(1);
                else            row.add(prev.get(j)+prev.get(j-1));
            }
            prev=row;
        }
        return row;
    }
}