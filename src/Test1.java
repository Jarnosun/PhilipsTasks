import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {

    //A method that produces a new matrix based to the task requirements
    public float[][] normalize(float A[][],float C, float D){
        int rows = A.length;
        int cols = A[0].length;
        float result[][] = new float[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = A[i][j] * C + D;
            }
        }
    return result;
    }
}
