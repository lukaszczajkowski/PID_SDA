package pid.exercise.sort;

public class SelectionSort {

    public static void sort(int[] array) {
		for(int i = 0; i < array.length - 1; i++){
			int currentMin = array[i];
			int currentMinIndex = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < currentMin){
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			swap(i, currentMinIndex, array);
		}
    }

    private static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
