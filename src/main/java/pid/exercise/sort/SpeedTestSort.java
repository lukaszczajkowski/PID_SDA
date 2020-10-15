package pid.exercise.sort;

import java.util.Arrays;

public class SpeedTestSort{

    public static void main(String[] args){

        int[] array1 = IntArrayGenerator.generateRandomSequence(100_000);

        System.out.println("Bubble sort = " + sortingSpeed(array1, 1));

        int[] array2 = IntArrayGenerator.generateRandomSequence(100_000);

        System.out.println("Selection sort = " + sortingSpeed(array2, 2));

        int[] array3 = IntArrayGenerator.generateRandomSequence(100_000);

        System.out.println("Java arrays sort = " + sortingSpeed(array3, 3));
    }

    /**
     * option 1 for bubble, option 2 for selection,
     * 
     */
    private static long sortingSpeed(int[] array, int option){
        long startTime = System.nanoTime();
        
        switch(option){
            case 1:
                BubbleSort.sort(array);
                break;
            case 2:
                SelectionSort.sort(array);
                break;
            case 3:
                Arrays.sort(array);
        }

        return System.nanoTime() - startTime;
    }

}