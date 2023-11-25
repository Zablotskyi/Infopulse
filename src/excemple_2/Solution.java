package excemple_2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //випадково розраховуємо розмірність масиву
        int sizeArray = (int) (Math.random() * 100);

        //створюємо масив розмірністю sizeArray
        int[] array = new int[sizeArray];
        //створюємо копію не відсортированого масиву для тесту нашого алгоритму
        int[] copyArray = new int[array.length];

        //формуємо масив з випадкових чисел
        for (int i = 0; i < sizeArray; i ++) {
            array[i] = copyArray[i] = (int) (Math.random() * 100);
        }

        //сортируємо масиви нашим методом і вбудованим в Java
        sortArray(array);
        Arrays.sort(copyArray);

        //порівнюємо відсортовані методи, якщо вони однакові, то виводимо повідомлення що наш метод працює
        if (Arrays.equals(array, copyArray)) {
            System.out.println("сортування працює");
        }
    }
    //алгоритм сортування масиву
    public static void sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i --) {
            for (int j = 0; j < i; j ++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
