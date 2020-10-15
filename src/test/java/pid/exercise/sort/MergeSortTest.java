package pid.exercise.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import pid.exercise.sort.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    public void sortHasNoEffectWhenArrayIsEmpty() {
        // Arrange
        int[] array = {};
        // Act
        int [] sortedArray = MergeSort.mergeSort(array);
        // Assert
        assertEquals(0, sortedArray);
    }

    /**
     * Assert that sorting an array with a single element has no effects.
     */
    @Test
    public void sortHasNoEffectWhenArrayHasSingleElement() {
        // Arrange
        int[] actual = {5};
        int[] expected = {5};
        // Act
        int [] sortedArray = MergeSort.mergeSort(actual);
        // Assert
        assertArrayEquals(expected, sortedArray);
    }

    /**
     * Assert that sorting a two element array results in a correct
     * ordering of the elements.
     */
    @Test
    public void sortTwoElementArrayGivesCorrectOrdering() {
        // Arrange
        int[] actual = {1, -1};
        int[] expected = {-1, 1};
        int[] sortedArray = MergeSort.mergeSort(actual); 
        SelectionSort.sort(actual);
        // Assert
        assertArrayEquals(expected, sortedArray);
    }

    /**
     * Assert that sorting a multiple element array results in a correct
     * ordering of the elements.
     */
    @Test
    public void sortMultipleElementArrayGivesCorrectOrdering() {
        // Arrange
        int[] actual = {3, 0, -15, 343, 99, 23, 10, 54, 2, 2, 1};
        int[] expected = actual.clone();
        Arrays.sort(expected); // We expect Arrays.sort to be correct as it is a highly battle-tested implementation.
        // Act
        int[] sortedArray = MergeSort.mergeSort(actual);
        // Assert
        assertArrayEquals(expected, sortedArray);
    }
    
}
