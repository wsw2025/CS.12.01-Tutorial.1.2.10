
public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        for(int i = 0; i < numRows; i++){
            for (int j = 0 ; j < numCols; j++){
                double c = Math.random();
                if(c<=0.4){
                    lights[i][j]=true;
                }else{
                    lights[i][j]=false;
                }
            }
        }

        // To be implemented.

    }

    public boolean evaluateLight(int row, int col)
    {
        int numOn = 0;
        for (int i = 0; i < col; i++){
            if(lights[row][i]) numOn++;
        }
        if(!lights[row][col]){
            if(numOn%2==0) return false;
        }else{
            if(numOn%3==0) return true;
        }

        return lights[row][col];
    }


    public boolean[][] getLights(){
        return this.lights;
    }

    public void setLights(boolean[][] lights){
        this.lights = lights;
    }
}
