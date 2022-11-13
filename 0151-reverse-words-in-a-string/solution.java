class Solution {
    public String reverseWords(String s) {
        String[] words =s.split(" ");
        int left  = 0 ;
        int right = words.length-1;
        while(left<right){
            //if(words[left].isEmpty()) left++;
            //if(words[right].isEmpty()) right--;
            String temp = words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        s="";
        for(String i : words) if(!i.isEmpty())s+=i+" ";
        return s.substring(0,s.length()-1);
    }
}
