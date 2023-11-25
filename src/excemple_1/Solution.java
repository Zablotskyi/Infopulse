package excemple_1;

public class Solution {
    public static void main(String[] args) {
        //створюємо і ініціюємо двовимірний масив
        int [][] array = new int[][] {{1, 2, 7, 30, 5, 70, 44}, {1, 4, 17, 30, 28, 99, 64}};

        //створюємо константи для формули
        final double C = -1.49;
        final double D = 23.4;
        int max = 0;
        int cols = 0;
        int rows = 0;
        double y = 0;

        //шукаємо max значення в двовимірному масиві
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    cols = i;
                    rows = j;
                }
            }
        }
        System.out.println(cols + " - координата х");
        System.out.println(rows + " - координата у");
        System.out.println(max + " - максимальний елемент масиву");

        //формула обчислення значення у враховуючи координати в масиві максимального значення
        y = Math.sqrt(Math.abs((Math.sin(Math.sin(C))) - (4 * Math.log(Math.log(D)) / (cols * rows))));
        System.out.println("значення у = " + y);

    }
}
