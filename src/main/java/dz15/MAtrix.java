package dz15;

public class MAtrix implements IMatrix {
    private double[][] matrix;

    public MAtrix(int[][] mAtrixAdd) {
        matrix = new double[IMatrix.DEFAULT_MATRIX_SIZE][IMatrix.DEFAULT_MATRIX_SIZE];
    }

    public MAtrix(int rows, int column) {
        matrix = new double[rows][column];

    }

    java.util.Scanner i = new java.util.Scanner(System.in);

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= getRows() || rowIndex <= 0) {
            throw new IndexOutOfBoundsException("индекс строки меньше нуля или больше (или равно) количества строк матрицы");
        }
        if (colIndex >= getColumns() || colIndex <= 0) {
            throw new IndexOutOfBoundsException("индекс столбца меньше нуля или больше (или равно) количества столбцов матрицы");
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= this.getRows() || rowIndex <= 0) {
            throw new IndexOutOfBoundsException("индекс строки меньше нуля или больше (или равно) количества строк матрицы");

        }
        if (colIndex >= this.getColumns() || colIndex <= 0) {
            throw new IndexOutOfBoundsException("индекс строки меньше нуля или больше (или равно) количества строк матрицы");

        }
        matrix[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        MAtrix result = new MAtrix(otherMatrix.getRows(), otherMatrix.getColumns());
        if (otherMatrix == null) {
            throw new NullPointerException("второй аргумент null");
        }
        if (otherMatrix.getRows() != this.getRows() || otherMatrix.getColumns() != this.getColumns()) {
            throw new IllegalArgumentException("текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов");
        }
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }


    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        MAtrix result = new MAtrix(otherMatrix.getRows(), otherMatrix.getColumns());
        if (otherMatrix == null) {
            throw new NullPointerException("второй аргумент null");
        }
        if (otherMatrix.getRows() != this.getRows() || otherMatrix.getColumns() != this.getColumns()) {
            throw new IllegalArgumentException("текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов");
        }
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;

    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        MAtrix result = new MAtrix(otherMatrix.getRows(), otherMatrix.getColumns());
        if (otherMatrix == null) {
            throw new NullPointerException("второй аргумент null");
        }
        if (otherMatrix.getRows() != this.getRows() || otherMatrix.getColumns() != this.getColumns()) {
            throw new IllegalArgumentException("текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов");
        }
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public int[][] transpose() {
        int[][] transpose = new int[getRows()][getColumns()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                transpose[i][j] = (int) matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        return transpose;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix[i][j] = value;
            }

        }

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i > matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0.0) {
                    return false;

                }

            }
        }

        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
