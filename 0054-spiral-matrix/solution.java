class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;
        int elements = n*m;
        int rowstart =0;
        int rowend = n-1;
        int colstart =0;
        int colend = m-1;
        List<Integer> ans= new ArrayList<>();
        while( colstart<=colend && rowstart<=rowend  ){
            for(int i=colstart ; i<=colend ; i++){ans.add(matrix[rowstart][i]);}
            rowstart++;
            for(int i =rowstart ; i<=rowend ; i++){ans.add(matrix[i][colend]);}
            colend--;
            if(rowend>=rowstart)for(int i=colend ; i>=colstart ; i--){ans.add(matrix[rowend][i]);}
            rowend--;
            if(colend>=colstart)for(int i =rowend ; i>=rowstart ; i--){ans.add(matrix[i][colstart]);}
            colstart++;
        }
        return ans;
    }
}
