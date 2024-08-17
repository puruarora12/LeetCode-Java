class Solution {
    public double myPow(double x, int n) {
        double ans =x;
        double ox = x ;
        
//         int pos = (int)Math.floor(Math.log(Math.abs(n))/Math.log(2.0));
//         int num = (int)Math.pow(2, pos);
//         int diff = Math.abs(n)-num;
//         System.out.println(pos+"   "+num);
//         while(num>1){
//             if(n>0) x *=x;
//             else if (n<0)x/=x;
//             num=num/2;
//             System.out.println(x+ "     "+num);
//         }
//         System.out.println(diff);
        
//         while(diff-->0) x*=ans;
        return Math.pow(ox, n);
    }
}
