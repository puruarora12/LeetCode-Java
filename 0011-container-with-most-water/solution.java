class Solution {
    public int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length-1;
        int ans =0 ;
        while(left<right){
            int low = Math.min(height[left],height[right]);
               if ( low*(right-left) <=ans ){
                  if(height[left]<height[right]) left++ ;
                      else right-- ;
                   } 
            else ans = low*(right-left)  ; 
        }
        
    return ans;
    }
}
