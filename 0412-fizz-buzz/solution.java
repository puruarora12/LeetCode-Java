class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ar = new ArrayList<String>();
        for(int i = 1 ; i <=n ; i++){
            if(i%3==0 && i%5==0) ar.add("FizzBuzz");
            else if( i%3==0) ar.add("Fizz");
            else if(i%5==0) ar.add("Buzz");
            else ar.add(""+i);
        }
        return ar;
    }
}
