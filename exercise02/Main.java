import java.util.Arrays;

/**
 * Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

   Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

   Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.*/
public class Main {

    /**
     * Метод выводит в терминал количество четных элементов в массиве.
     * @param array - целочисленный массив
     */
    public void countEvens(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                count++;
            }
        }

        System.out.print("В массиве ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(count + " четных элементов");
    }

    /**
     * Метод выводит в терминал разницу между max и min значениями элементов массива.
     * @param array - целочисленный массив.
     */
    public void subMaxMin(int[] array){
        int max = Arrays.stream(array)
                .max()
                .getAsInt();

        int min = Arrays.stream(array)
                .min()
                .getAsInt();
        int result = max - min;

        System.out.println("Разница между max и min элементами массива равна " + result);
    }

    /**
     * Метод возвращает boolean значение, если в переданном массиве есть два соседних элемента
     * равны 0.
     * @param array - целочисленный массив
     * @return boolean значение
     */
    public boolean have00(int[] array){
        int j = 1;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] == 0 && array[j] == 0){
                return true;
            }
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        int[] array = new int[] {1, 3, 8, 0, 0, 4, 5, 7, 9};

        obj.countEvens(array);

        obj.subMaxMin(array);

        System.out.println(obj.have00(array));
    }
}
