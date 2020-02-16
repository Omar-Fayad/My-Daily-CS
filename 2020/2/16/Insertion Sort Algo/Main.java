public class Main {

	public static void main(String[] args) {

		int[] arrayToBeSorted = { 1, 7, 3, 4, 6, 8, 2, 5, 556, 788, 34, 68, 43, 85, 37, 95, 23, 59 };

		printArray(insertionSort(arrayToBeSorted));
	}

	public static int[] insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {

			int j = i - 1;
			int temp = array[i];
			
			while (array[j] > temp && j >= 0) {

				array[j + 1] = array[j];
				j--;
			}
		
			array[j + 1] = temp;

		}
		return array;
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
