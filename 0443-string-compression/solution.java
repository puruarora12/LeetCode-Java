class Solution {
    public int compress(char[] chars) {
        int i = 0 , index = 0;

        while(i<chars.length){
            int groupLength = 1;
            while(i+groupLength<chars.length &&  chars[i+groupLength]==chars[i])groupLength++;

            chars[index++]=chars[i];
            if(groupLength>1)
                for(char c : (groupLength+"").toCharArray()) chars[index++]=c;

            i+=groupLength;
        }

        return index;
    }
}
