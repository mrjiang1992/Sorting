package com.lj.sorting;

public class AllSortingAlgo {
	private AllSortingAlgo() {
	}

	// runtime O(n log n)
	public static int[] mergeSort(int[] unsorted) {
		// recursive approach
		int[] sorted = divideAndConquer(unsorted);

		return sorted;
	}

	public static int[] divideAndConquer(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}
		int[] firstHalf = new int[array.length / 2];
		int[] secondHalf = new int[array.length - array.length / 2];
		System.arraycopy(array, 0, firstHalf, 0, array.length / 2);
		System.arraycopy(array, array.length / 2, secondHalf, 0, array.length - array.length / 2);
		firstHalf = divideAndConquer(firstHalf);
		secondHalf = divideAndConquer(secondHalf);

		int[] mergeArray = new int[firstHalf.length + secondHalf.length];
		int fHC = 0, sHC = 0, mC = 0;

		while (fHC < firstHalf.length && sHC < secondHalf.length) {
			if (firstHalf[fHC] < secondHalf[sHC]) {
				mergeArray[mC] = firstHalf[fHC];
				fHC++;
			} else {
				mergeArray[mC] = secondHalf[sHC];
				sHC++;
			}
			mC++;
		}
		while (fHC < firstHalf.length) {
			mergeArray[mC] = firstHalf[fHC];
			mC++;
			fHC++;
		}
		while (sHC < secondHalf.length) {
			mergeArray[mC] = secondHalf[sHC];
			mC++;
			sHC++;
		}

		return mergeArray;
	}

	// runtime O(n^2)
	public static int[] insertionSort(int[] unsortedArray) {
		if (unsortedArray == null) {
			return unsortedArray;
		}
		int[] sortedArray = unsortedArray.clone();
		for (int i = 1; i < sortedArray.length; i++) {
			int temp = sortedArray[i];
			int j = i - 1;
			while (j >= 0 && sortedArray[j] > temp) {
				sortedArray[j + 1] = sortedArray[j];
				j--;
			}
			sortedArray[j + 1] = temp;
		}
		return sortedArray;
	}

	// runtime O(n^2)
	public static int[] bubbleSort(int[] unsortedArray) {
		if (unsortedArray == null) {
			return unsortedArray;
		}
		int[] sortedArray = unsortedArray.clone();
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = 1; j < sortedArray.length - i; j++) {
				if (sortedArray[j] < sortedArray[j - 1]) {
					int temp = sortedArray[j - 1];
					sortedArray[j - 1] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}
		return sortedArray;
	}

	// runtime O(n^2)
	public static int[] selectionSort(int[] unsortedArray) {
		if (unsortedArray == null) {
			return unsortedArray;
		}
		int[] sortedArray = unsortedArray.clone();
		int tempCounter = 0, tempValue = 0;
		for (int i = 0; i < sortedArray.length - 1; i++) {
			tempCounter = i;
			tempValue = sortedArray[i];
			for (int j = i + 1; j < sortedArray.length; j++) {
				if (sortedArray[j] < tempValue) {
					tempCounter = j;
					tempValue = sortedArray[j];
				}
			}
			sortedArray[tempCounter] = sortedArray[i];
			sortedArray[i] = tempValue;
		}
		return sortedArray;
	}

	public static int[] quickSort(int[] unsortedArray) {
		if (unsortedArray == null) {
			return unsortedArray;
		}
		int[] sortedArray = unsortedArray.clone();
		pivot(sortedArray, 0, sortedArray.length - 1);
		return sortedArray;
	}

	public static void pivot(int[] sortedArray, int start, int end) {
		if (start < end) {
			int pivot = sortedArray[end];
			int pivotCounter = 0, tempValue = 0;
			for (int i = 0; i < end; i++) {
				if (sortedArray[i] <= pivot) {
					tempValue = sortedArray[i];
					sortedArray[i] = sortedArray[pivotCounter];
					sortedArray[pivotCounter] = tempValue;
					pivotCounter++;
				}
			}
			sortedArray[end] = sortedArray[pivotCounter];
			sortedArray[pivotCounter] = pivot;
			pivot(sortedArray, start, pivotCounter - 1);
			pivot(sortedArray, pivotCounter + 1, end);
		}
	}

	public static int[] countingSort(int[] unsortedArray) {
		if (unsortedArray == null) {
			return unsortedArray;
		}
		int largestInt = Integer.MIN_VALUE;
		for (int i = 0; i < unsortedArray.length; i++) {
			if (unsortedArray[i] > largestInt) {
				largestInt = unsortedArray[i];
			}
		}
		int[] sortedArray = new int[unsortedArray.length];
		if (largestInt >= 0) {
			int[] tempArray = new int[largestInt + 1];

			for (int i = 0; i < unsortedArray.length; i++) {
				tempArray[unsortedArray[i]]++;
			}

			for (int i = 1; i < tempArray.length; i++) {
				tempArray[i] += tempArray[i - 1];
			}

			for (int i = 0; i < unsortedArray.length; i++) {
				sortedArray[tempArray[unsortedArray[i]]-1] = unsortedArray[i];
				tempArray[unsortedArray[i]]--;
			}
		}
		return sortedArray;
	}

}