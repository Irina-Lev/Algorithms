import java.util.Arrays;

public class Algorithm {
    private int[] array;

    public void fillArray(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
//        System.out.print(Arrays.toString(array));
    }

    public void sortJava() {
        long start = System.nanoTime();
        Arrays.sort(array);
        long finish = System.nanoTime();
        long passed = finish - start;

//        System.out.print(Arrays.toString(array));
        System.out.println("Method Arrays.sort() took time " + passed + " nanoseconds.");
    }

    public void bubbleSort() {
        long start = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        long finish = System.nanoTime();
        long passed = finish - start;

//        System.out.print(Arrays.toString(array));
        System.out.println("First method took time " + passed + " nanoseconds.");
    }


    public void insertionSort() {
        long start = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        long finish = System.nanoTime();
        long passed = finish - start;

//        System.out.print(Arrays.toString(array));
        System.out.println("Second method took time " + passed + " nanoseconds.");
    }


}
