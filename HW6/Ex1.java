public class Ex1 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}};
        int[][] b={{6,3,4},{5,1,2}};
        int[][] c=new int[2][3];

        Matrix mx=new Matrix();
        System.out.println("행렬 a");
        mx.printMatrix(a);
        System.out.println("행렬 b");
        mx.printMatrix(b);
        System.out.println("행렬 c");
        mx.addMatrix(a, b, c);
        mx.printMatrix(c);
    }
}
class Matrix {
    public void printMatrix(int[][] x) {
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public void addMatrix(int[][] x, int[][] y, int[][] z) {
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                z[i][j]=x[i][j]+y[i][j];
            }
        }
    }
}
