class Solution {
    public int[][] kClosest(int[][] points, int k) {
        sort(0 , points.length-1, points);
        int[][] ans = new int[k][2];
        
        
        //for(int[] i : points) System.out.print("final points "+i[0]+" "+i[1]);
        
        
        
        for(int i =0 ; i<k ; i++) ans[i]=points[i];
        return ans;
    }
    
    public void sort(int left, int right, int[][] points){
        if(left<right){
        int mid = left+(right-left)/2;
            //System.out.println("sort "+" left "+left+" mid "+mid+" right "+right);
            sort(left, mid, points);
            sort(mid+1, right, points);
            merge (left, mid , right, points);
        }
    }
    
    public void merge(int left , int mid, int right, int[][] points){
        int llength = mid-left+1;
        int rlength = right - mid;
        //System.out.println("merge "+" left "+left+" mid "+mid+" right "+right);
        
        int[][] lpoints = new int[llength][2];
        int[][] rpoints = new int[rlength][2];
        
        for(int i = 0 ; i<llength ; i++) {
           lpoints[i] = points[left+i];
           // System.out.println("lpoints "+lpoints[i][0]+" "+lpoints[i][1]);
        }
        
        for(int i = 0 ; i<rlength ; i++) {
            rpoints[i] = points[mid+1+i];
           //System.out.println("rpoints "+rpoints[i][0]+" "+rpoints[i][1]);
            
        }
        
        int index =left;
        int lindex =0 ; 
        int rindex = 0;
        while(lindex<llength && rindex<rlength ){
            if(distance(lpoints[lindex])<=distance(rpoints[rindex])){
                points[index]=lpoints[lindex];
                lindex++;
            }else{
                points[index]=rpoints[rindex];
                rindex++;
            }
            index++;
        }
        
        
        //for(int[] i : points) System.out.println(i[0]+" "+i[1]);
        
        
        while(lindex<llength){
            points[index]=lpoints[lindex];
            index++;
            lindex++;
        }
        
        while(rindex<rlength){
                points[index]=rpoints[rindex];
                index++;
            rindex++;
        }
        
    }
    public int distance(int[] point){
        return (point[0]*point[0]+point[1]*point[1]);
    }
}
