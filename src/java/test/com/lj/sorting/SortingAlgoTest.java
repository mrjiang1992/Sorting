package com.lj.sorting;

import org.junit.Assert;
import org.junit.Test;

public class SortingAlgoTest {

	@Test
	public void testSortedArray() {
		int[] unsortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] mergeSortArray = AllSortingAlgo.mergeSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, mergeSortArray);

		int[] insertionSortArray = AllSortingAlgo.insertionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, insertionSortArray);

		int[] bubbleSortArray = AllSortingAlgo.bubbleSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, bubbleSortArray);
		
		int[] selectionSortArray = AllSortingAlgo.selectionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, selectionSortArray);
		
		int[] quickSortArray = AllSortingAlgo.quickSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, quickSortArray);
		
		int[] countingSortArray = AllSortingAlgo.countingSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, countingSortArray);
	}

	@Test
	public void testUnsortedArray() {
		int[] unsortedArray = { 4, 5, 3, 9, 7, 1, 8, 6, 2 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] mergeSortArray = AllSortingAlgo.mergeSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, mergeSortArray);

		int[] insertionSortArray = AllSortingAlgo.insertionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, insertionSortArray);

		int[] bubbleSortArray = AllSortingAlgo.bubbleSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, bubbleSortArray);
		
		int[] selectionSortArray = AllSortingAlgo.selectionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, selectionSortArray);
		
		int[] quickSortArray = AllSortingAlgo.quickSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, quickSortArray);
		
		int[] countingSortArray = AllSortingAlgo.countingSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, countingSortArray);
	}

	@Test
	public void testReversedArray() {
		int[] unsortedArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] mergeSortArray = AllSortingAlgo.mergeSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, mergeSortArray);

		int[] insertionSortArray = AllSortingAlgo.insertionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, insertionSortArray);

		int[] bubbleSortArray = AllSortingAlgo.bubbleSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, bubbleSortArray);
		
		int[] selectionSortArray = AllSortingAlgo.selectionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, selectionSortArray);
		
		int[] quickSortArray = AllSortingAlgo.quickSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, quickSortArray);
		
		int[] countingSortArray = AllSortingAlgo.countingSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, countingSortArray);
	}

	@Test
	public void testFirstAndLastElementOutOfOrder() {
		int[] unsortedArray = { 9, 2, 3, 4, 5, 6, 7, 8, 1 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] mergeSortArray = AllSortingAlgo.mergeSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, mergeSortArray);

		int[] insertionSortArray = AllSortingAlgo.insertionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, insertionSortArray);

		int[] bubbleSortArray = AllSortingAlgo.bubbleSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, bubbleSortArray);

		int[] selectionSortArray = AllSortingAlgo.selectionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, selectionSortArray);
		
		int[] quickSortArray = AllSortingAlgo.quickSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, quickSortArray);
		
		int[] countingSortArray = AllSortingAlgo.countingSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, countingSortArray);
	}

	@Test
	public void testEmptyArray() {
		int[] unsortedArray = {};
		int[] expectedArray = {};

		int[] mergeSortArray = AllSortingAlgo.mergeSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, mergeSortArray);

		int[] insertionSortArray = AllSortingAlgo.insertionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, insertionSortArray);

		int[] bubbleSortArray = AllSortingAlgo.bubbleSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, bubbleSortArray);
		
		int[] selectionSortArray = AllSortingAlgo.selectionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, selectionSortArray);
		
		int[] quickSortArray = AllSortingAlgo.quickSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, quickSortArray);
		
		int[] countingSortArray = AllSortingAlgo.countingSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, countingSortArray);
	}

	@Test
	public void testNullArray() {
		int[] unsortedArray = null;
		int[] expectedArray = null;

		int[] mergeSortArray = AllSortingAlgo.mergeSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, mergeSortArray);

		int[] insertionSortArray = AllSortingAlgo.insertionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, insertionSortArray);

		int[] bubbleSortArray = AllSortingAlgo.bubbleSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, bubbleSortArray);
		
		int[] selectionSortArray = AllSortingAlgo.selectionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, selectionSortArray);
		
		int[] quickSortArray = AllSortingAlgo.quickSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, quickSortArray);
		
		int[] countingSortArray = AllSortingAlgo.countingSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, countingSortArray);
	}
	
	@Test
	public void testDuplicateElement() {
		int[] unsortedArray = { 9, 2, 3, 4, 5, 6, 7, 8, 1, 5, 7, 4, 1};
		int[] expectedArray = { 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9 };

		int[] mergeSortArray = AllSortingAlgo.mergeSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, mergeSortArray);

		int[] insertionSortArray = AllSortingAlgo.insertionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, insertionSortArray);

		int[] bubbleSortArray = AllSortingAlgo.bubbleSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, bubbleSortArray);

		int[] selectionSortArray = AllSortingAlgo.selectionSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, selectionSortArray);
		
		int[] quickSortArray = AllSortingAlgo.quickSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, quickSortArray);
		
		int[] countingSortArray = AllSortingAlgo.countingSort(unsortedArray);

		Assert.assertArrayEquals(expectedArray, countingSortArray);
	}
}
