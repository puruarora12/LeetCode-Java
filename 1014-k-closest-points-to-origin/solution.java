class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[] distance = new int[points.length];
        
        for(int i =0 ; i<points.length ; i++) distance[i] = (int)(Math.pow(points[i][0],2)+ Math.pow(points[i][1],2));
        
        sort(0 , distance.length-1, distance, points);
        int[][] ans = new int[k][2];
        
        
        //for(int[] i : points) System.out.print("final points "+i[0]+" "+i[1]);
        
        
        
        for(int i =0 ; i<k ; i++) ans[i]=points[i];
        return ans;
    }
    
    public void sort(int left, int right, int[] dis , int[][] points){
        if(left<right){
        int mid = left+(right-left)/2;
            //System.out.println("sort "+" left "+left+" mid "+mid+" right "+right);
            sort(left, mid, dis, points);
            sort(mid+1, right, dis, points);
            merge (left, mid , right , dis, points);
        }
    }
    
    public void merge(int left , int mid, int right, int[] dis, int[][] points){
        int llength = mid-left+1;
        int rlength = right - mid;
        //System.out.println("merge "+" left "+left+" mid "+mid+" right "+right);
        int[] ldis = new int[llength];
        int[] rdis = new int[rlength];
        int[][] lpoints = new int[llength][2];
        int[][] rpoints = new int[rlength][2];
        
        for(int i = 0 ; i<llength ; i++) {
            ldis[i] = dis[left + i];
            lpoints[i] = points[left+i];
           // System.out.println("lpoints "+lpoints[i][0]+" "+lpoints[i][1]);
        }
        
        for(int i = 0 ; i<rlength ; i++) {
            rdis[i] = dis[mid+1 + i];
            rpoints[i] = points[mid+1+i];
           //System.out.println("rpoints "+rpoints[i][0]+" "+rpoints[i][1]);
            
        }
        
        int index =left;
        int lindex =0 ; 
        int rindex = 0;
        while(lindex<llength && rindex<rlength ){
            if(ldis[lindex]<=rdis[rindex]){
                dis[index]=ldis[lindex];
                points[index]=lpoints[lindex];
                lindex++;
            }else{
                 dis[index]=rdis[rindex];
                points[index]=rpoints[rindex];
                rindex++;
            }
            index++;
        }
        
        
        //for(int[] i : points) System.out.println(i[0]+" "+i[1]);
        
        
        while(lindex<llength){
            dis[index]=ldis[lindex];
             points[index]=lpoints[lindex];
            index++;
            lindex++;
        }
        
        while(rindex<rlength){
             dis[index]=rdis[rindex];
                points[index]=rpoints[rindex];
                index++;
            rindex++;
        }
        
    }
}
