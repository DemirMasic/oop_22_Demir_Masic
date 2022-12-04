package week6;

public class BinarySearch {
	 public static boolean search(int[] array, int searchedValue) {
		 int left = 0;
		 int right = array.length - 1;
		 
		 while(left <= right) {
			 int middle = (left + right) / 2;
			 if (searchedValue > array[middle]) {
				 left = middle + 1;
			 }
			 else if (searchedValue < array[middle]) {
				 right = middle - 1;
			 }
			 else {
				 return true;
			 }
		 }
		 return false;
		 
	 }
}
