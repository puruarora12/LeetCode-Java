class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> num = new Stack<Integer>();
        int len = digits.length-1;
        int sum = 0;
        for(int i=len; i>=0 ; i--){
            len=i;
            sum = digits[i]+1;
            if(sum>9) num.push(sum%10);
            else{
                num.push(sum);
                break;
            } 
        } if(sum>9) num.push(1);
      
        int ans[] = new int[len+num.size()];
        for(int j=0 ; j<len ; j++) ans[j]=digits[j];
        while(num.empty()!=true) {
            ans[len++]=num.pop();
    }
        return ans;
}
}
