class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
int rows = matrix.length;
int cols  = matrix[0].length;

int indexr = 0;
int indexc = 0 ; 
//System.out.println(rows+"   "+cols);
int upperlimitr=rows-1;
int upperlimitc = cols-1;

int midr = (int)Math.ceil((upperlimitr+indexr)/2.0);
int midc = (int)Math.ceil((upperlimitc+indexc)/2.0);
        
 
	while( (indexr<=upperlimitr) && (indexc<=upperlimitc) ){
      //  System.out.println("inside");
      //  System.out.println("indexr is "+indexr+" uperlimitr "+upperlimitr+"  midr "+midr);
       // System.out.println("indexc is "+indexc+" uperlimitc "+upperlimitc+"  midc "+midc);
	if (matrix[midr][midc]==target){
        return true;
    }
	else if (target>= matrix[midr][indexc]  &&  target<= matrix[midr][upperlimitc] ){
		//System.out.println("It shoudlnot come in this less than cases ");
        if (target<matrix[midr][midc]){
            upperlimitc=midc-1;
            midc = (int)Math.ceil((upperlimitc+indexc)/2.0);
        }
		else if (target>matrix[midr][midc]){ 
            indexc =midc+1;
			 midc = (int)Math.ceil((upperlimitc+indexc)/2.0);
			}

			
	}
	else if (target>matrix[midr][cols-1]){
		indexr = midr+1;
        //indexc = midc+1;
      //  System.out.println("in this cases? ");
        midr = (int)Math.ceil((upperlimitr+indexr)/2.0);
        //midc = (int)Math.ceil((upperlimitc+indexc)/2.0);
        
        
    }
	else if (target<matrix[midr][0]){
		upperlimitr = midr-1;
        //upperlimitc = midc-1;
        midr = (int)Math.ceil((upperlimitr+indexr)/2.0);
       // System.out.println("It shoudl come in this less than cases ");
       // midc = (int)Math.ceil((upperlimitc+indexc)/2.0);
    }
        else return false;
	}

return false;
    }
}
