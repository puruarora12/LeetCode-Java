class Solution {
    public int maxFrequencyElements(int[] nums) {
        //Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0 ;
        for(int i = 0 ;i<nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            }
        
        ArrayList<Integer> ar= new ArrayList<>();
        for(int i :map.values()){
        ar.add(i);
           // System.out.println(i);
        }
        Collections.sort(ar);
        System.out.println(ar);
        for(int i = ar.size()-1 ; i>=0; i--){
            if(ar.get(i)==ar.get(ar.size()-1))
            total+=ar.get(i);
            
        }
        return total;
        }
    }

