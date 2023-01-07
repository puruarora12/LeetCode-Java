import java.math.BigInteger;

class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        Boolean bulk = false;
        Boolean heavy = false;
        BigInteger len  = new BigInteger(""+length);
        BigInteger hie  = new BigInteger(""+height);
        BigInteger wid  = new BigInteger(""+width);
        BigInteger volume = wid.multiply(len.multiply(hie));
        BigInteger comp = new BigInteger("1000000000");
        int compared = volume.compareTo(comp);
        //System.out.println(volume+"   "+ Math.pow(10,9));
        if(length>=10000 || width>=10000 || height>=10000 || compared>=0) bulk=true;
        if(mass>=100) heavy=true;
        
        if(bulk && heavy) return "Both";
        else if(bulk) return "Bulky";
        else if(heavy) return "Heavy";
        else return "Neither";
    }
}
