class Solution {
    //SOHAM2099
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]+1<=9)
            {
                digits[i]+=1;
                return digits;
            }
            else
            {
                digits[i]=(digits[i]+1)%10;

                if(i==0)
                {
                    int[] NewArray=new int[digits.length+1];
                    NewArray[0]=1;
                    System.arraycopy(digits,0,NewArray,1,digits.length);
                    return NewArray;
                }
            }
        }
        return digits;
    }
}