/**
 * Class implementing the insertion sort algorithm.
 */
public class InsertionSort {
  /**
   * Apply insertion sort to an array of integers.
   *
   * @param arr Array of integers to be sorted.
   */
  public void insertionSort(int[] arr) {
    // the outer loop controls which "card" is 
    // added to the "hand" next
    for(int j = 1; j < arr.length; j++) {
      // temp is the "card" we're inserting
      int temp = arr[j];
      int i = j - 1;

      // the inner loop creates an opening
      // for the "card" being added
      while(i >= 0 && arr[i] > temp) {
        arr[i + 1] = arr[i];
        i--;
      } // while

      // after making the opening, place the "card"
      arr[i + 1] = temp;
    } // for 
  } // insertionSort
}