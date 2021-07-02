class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      
        Integer ans[] = new Integer[k];
        int value[] = new int[arr.length];
        for(int i = 0 ; i<arr.length ; i++){
            value[i]=Math.abs(arr[i]-x);
        }
        
        for(int i: value)
            System.out.print(i+"  ");
        System.out.println();
        
        
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(value[i]>value[j]){
                    int temp =value[j];
                    value[j]=value[i];
                    value[i]=temp;
                   
                    int temp2 =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp2;
                    
                }
                 if(value[i]==value[j]){
                        int temp = Math.max(arr[i],arr[j]);
                     arr[i]=Math.min(arr[i],arr[j]);
                     arr[j]=temp;
                    }
            }
        }
        for(int i:value)System.out.print(i+"  ");
        
        for(int i =0 ; i<k ;i++){
           ans[i]=arr[i];
        }
        Arrays.sort(ans);
          List<Integer> ls  = Arrays.asList(ans);
        return ls;
    }
}
