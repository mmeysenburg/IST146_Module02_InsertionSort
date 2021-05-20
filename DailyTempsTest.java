import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DailyTempsTest {
  // test objects
  private int[] t1 = {45, 32, 25, 31, 63, 61, 23};
  private int[] t3 = {64, 81, 88, 84, 66, 79, 85};
  private int[] t4 = {57, 63, 63, 57, 57, 63, 63};
  private DailyTemps dt1, dt2, dt3, dt4;
  private String dt1Str, dt3Str;

  @Before
  public void setUp() throws Exception {

    // dt1 and dt2 should have same values
    dt1 = new DailyTemps(t1);
    dt2 = new DailyTemps(t1);
    dt1Str = Arrays.toString(t1);

    // dt3 is different
    dt3 = new DailyTemps(t3);
    dt3Str = Arrays.toString(t3);

    // dt4 will be changed to match t4 later
    dt4 = new DailyTemps(t3);
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testGetTemp() {
    for(int i = 0; i < t1.length; i++) {
      assertEquals(t1[i], dt1.getTemp(i));
      assertEquals(t3[i], dt3.getTemp(i));
    }
  }

  @Test
  public void testSetTemp() {
    for(int i = 0; i < t4.length; i++) {
      dt4.setTemp(i, t4[i]);
      assertEquals(t4[i], dt4.getTemp(i));
    }
  }

  @Test
  public void testNumberOfDaysBelowFreezing() {
    assertEquals(3, dt1.numberOfDaysBelowFreezing());
    assertEquals(0, dt3.numberOfDaysBelowFreezing());
  }

  @Test
  public void testGetMeanTemperature() {
    assertEquals(40.0, dt1.getMeanTemperature(), 0.01);
    assertEquals(78.14, dt3.getMeanTemperature(), 0.01);
  }

  @Test
  public void testEquals() {
    assertTrue(dt1.equals(dt2));
    assertFalse(dt1.equals(dt3));
    assertFalse(dt1.equals("NOPE"));
  }

  @Test
  public void testToString() {
    assertEquals(dt1Str, dt1.toString());
    assertEquals(dt3Str, dt3.toString());
  }

  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("DailyTempsTest");
  }
}