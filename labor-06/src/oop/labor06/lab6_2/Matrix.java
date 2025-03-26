package oop.labor06.lab6_2;
import java.util.Random;

public class Matrix {
    double[][] data;
    private final int rows, colums;
    public Matrix(int rows, int colums) {
        this.rows = rows;
        this.colums = colums;
        this.data = new double[rows][colums];
    }
    public Matrix(double[][] mat){
         this.data = mat;
         this.rows = mat.length;
         this.colums = (this.rows > 0) ? data[0].length : 0 ;
    }
    public Matrix(Matrix matrix){
        this.data=matrix.data;
        this.rows = matrix.rows;
        this.colums = matrix.colums;
    }
    public void fillRandom(double min, double max){
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                data[i][j] = min + rand.nextDouble() % (max - min + 1);
            }
        }
    }
    public int getRows() {
        return rows;
    }
    public int getColums() {
        return colums;
    }
    public void printMatrix(){
        for (double[] rows : data) {
            for (double val : rows) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }

    }
    public static Matrix add(Matrix mat1, Matrix mat2){
        Matrix sumMatrix = new Matrix(mat1.getRows(),mat2.getColums());
        double[][] resultData = new double[mat1.getRows()][mat1.getColums()];
        if (mat1.getRows() != mat2.getRows() || mat1.getColums() != mat2.getColums()) {
            return null;
        }
        for (int i = 0; i < mat1.getRows(); i++) {
            for (int j = 0; j < mat1.getColums(); j++) {
                resultData[i][j] = mat1.data[i][j] + mat2.data[i][j];
            }
        }
        sumMatrix.data = resultData;
        return sumMatrix;
    }
    public static Matrix multiply(Matrix mat1, Matrix mat2){
        if (mat1.getColums() != mat2.getRows()) {
            return null;
        }
        double[][] resultData = new double[mat1.getRows()][mat2.getColums()];
        Matrix multiplyMatrix = new Matrix(mat1.getRows(),mat2.getColums());
        for (int i = 0; i < mat1.getRows(); i++) {
            for (int j = 0; j < mat2.getColums(); j++) {
                for (int k = 0; k < mat1.getColums(); k++) {
                    resultData[i][j] += mat1.data[i][k] * mat2.data[k][j];
                }
            }
        }
        multiplyMatrix.data=resultData;
        return multiplyMatrix;
    }
    public static Matrix transpose(Matrix mat){
        double[][] transposed = new double[mat.getColums()][mat.getRows()];
        Matrix traspos = new Matrix(mat.getColums(),mat.getRows());
        for (int i = 0; i < mat.getRows(); i++) {
            for (int j = 0; j < mat.getColums(); j++) {
                transposed[j][i] = mat.data[i][j];
            }
        }
        traspos.data = transposed;
        return traspos;
    }
}
