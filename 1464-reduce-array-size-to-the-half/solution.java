class Solution {
    public int minSetSize(int[] arr) {
        ArrayList<Integer> ar = new ArrayList<>();
        int count =0 ;
        Arrays.sort(arr);
        int pos  = arr[0];
        for (int i = 0 ; i<arr.length ; i++){
            if (pos == arr[i])
                count++;
            else{
                ar.add(count);
                count =1 ;
                pos  = arr[i];
            }
        }
        ar.add(count);
        Collections.sort(ar);
        for(int e :ar)
            System.out.print(e+" ");
        System.out.println();
        int n = arr.length;
        int index = ar.size()-1;
        int setsize = 0;
        while(n>arr.length/2){
             n-= ar.get(index);
            index--;
            setsize++;
        }
        
        return setsize;
        
    }
}
