package dz15;

import lesson13.IMatrix;
import lesson13.MAtrix;

public class Main1 {
    public static void main(String[] args) {
        lesson13.MAtrix mAtrix1 = new lesson13.MAtrix(3, 3);
        System.out.println(mAtrix1.getRows());
        System.out.println(mAtrix1.getColumns());
        System.out.println(mAtrix1.getValueAt(9, 1));

        mAtrix1.setValueAt(0, 0, 2);
        mAtrix1.setValueAt(0, 1, 1);
        mAtrix1.setValueAt(0, 2, 5);
        mAtrix1.setValueAt(1, 0, 7);
        mAtrix1.setValueAt(1, 1, 9);
        mAtrix1.setValueAt(1, 2, 4);
        mAtrix1.setValueAt(2, 0, 7);
        mAtrix1.setValueAt(2, 1, 6);
        mAtrix1.setValueAt(2, 2, 4);


        lesson13.MAtrix mAtrix2 = new MAtrix(3, 3);
        mAtrix1.setValueAt(0, 0, 2);
        mAtrix2.setValueAt(0, 1, 2);
        mAtrix2.setValueAt(0, 2, 6);
        mAtrix2.setValueAt(1, 0, 2);
        mAtrix2.setValueAt(1, 1, 4);
        mAtrix2.setValueAt(1, 2, 7);
        mAtrix2.setValueAt(2, 0, 8);
        mAtrix2.setValueAt(2, 1, 7);
        mAtrix2.setValueAt(2, 2, 5);


        System.out.println(mAtrix1.isIdentityMatrix());


        System.out.println(mAtrix1.transpose());
        mAtrix1.printToConsole();



    }

}
