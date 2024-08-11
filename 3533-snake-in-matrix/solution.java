class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r = 0 ; int c = 0 ;
        for (String i: commands){
            if(i.equals("UP"))r--;
            else if (i.equals("DOWN"))r++;
            else if (i.equals("LEFT"))c--;
            else if(i.equals("RIGHT"))c++;
        else continue;
        }
        return n*r+c;
    }
}
