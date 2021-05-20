import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for InsertionSort.
 */
public class InsertionSortTest {
  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testInsertionSort() {
    // create an array to sort, fill it with
    // random values
    Random prng = new Random();
    int[] arr = new int[10000];
    for(int i = 0; i < arr.length; i++) {
      // large array, small range of values will 
      // result in duplicate values
      arr[i] = prng.nextInt(1000);
    }

    // create an ArrayList holidng unsorted values
    List<Integer> unsorted = new LinkedList<>();
    for(int i : arr) {
      unsorted.add(i);
    }

    // sort using inserstion sort
    InsertionSort is = new InsertionSort();
    is.insertionSort(arr);

    // verify arr is in fact sorted
    for(int i = 0; i < arr.length - 1; i++) {
      assertTrue(arr[i] <= arr[i + 1]);
    }

    // verify arr contains same values as before
    for(int i : arr) {
      // list remove method returns true if value
      // was successfully removed
      assertTrue(unsorted.remove((Object)i));
    }
    assertTrue(unsorted.isEmpty());
  }

  /**
   * Test launcher.
   *
   * @param args Command-line arguments; ignored by 
   * this application
   */
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("InsertionSortTest");
  }
}