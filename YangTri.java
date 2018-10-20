package demo;

public class YangTri {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        for(int i=0;i<10;i++) {
            a[i][0] = 1;
            a[i][i] = 1;
        }
        for(int i=2;i<10;i++){
            for(int j=1;j<i;j++) {
                a[i][j] = a[i-1][j]+a[i-1][j-1];
            }
        }
        for(int i =0;i<10;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}