class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
int rows = matrix.length;
int cols  = matrix[0].length;

int indexr = 0;
int indexc = 0 ; 

int upperlimitr=rows-1;
int upperlimitc = cols-1;

int midr = (int)Math.ceil((upperlimitr+indexr)/2.0);
int midc = (int)Math.ceil((upperlimitc+indexc)/2.0);
        
 
	while( (indexr<=upperlimitr) && (indexc<=upperlimitc) ){
     
	if (matrix[midr][midc]==target){
        return true;
    }
	else if (target>= matrix[midr][indexc]  &&  target<= matrix[midr][upperlimitc] ){

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
        midr = (int)Math.ceil((upperlimitr+indexr)/2.0);
    
    }
	else if (target<matrix[midr][0]){
		upperlimitr = midr-1;
        midr = (int)Math.ceil((upperlimitr+indexr)/2.0);
    }
    else return false;
	}

return false;
    }
}
