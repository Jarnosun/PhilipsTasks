public class Test2 {

    //A void method for rotating a bitmap based on value n where n is the degrees rotated
    public void rotateImage(int[][] bitmap, int n){
        for (int i = 0; i<n; i++){
            for (int j = i; j < n; j++){
                int temp = bitmap[i][j];
                bitmap[i][j] = bitmap[j][i];
                bitmap[j][i] = temp;
            }
        }
        for(int i = 0; i<n; i++){
            int top = 0;
            int bottom = n-1;
            while(top<bottom){
                int temp = bitmap[top][i];
                bitmap[top][i] = bitmap[bottom][i];
                bitmap[bottom][i] = temp;
                top++;
                bottom--;
            }
        }
    }
}
