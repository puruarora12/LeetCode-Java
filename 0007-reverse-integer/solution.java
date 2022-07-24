class Solution {
    public int reverse(int x) {
        boolean b = false;
        if(x<0) b= true;
        String nums = ""+x;
        String s  = "";
        
        //StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<nums.length(); i++){
            if(i==0 && nums.charAt(i)=='-' ) b=true;
            else s=nums.charAt(i)+s ;
        }
        long num = Long.parseLong(s);
       // System.out.println(num);
        if(b) num*=-1;
        if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE) return 0;
        else return (int)num;
    }
}
