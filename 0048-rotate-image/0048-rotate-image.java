class Solution {
    public void rotate(int[][] matrix) {
        int arr[][] = new int [matrix.length][matrix[0].length];

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                arr[i][j] = matrix[j][i];
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            int a = 0;
            int b = matrix.length-1;

            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}