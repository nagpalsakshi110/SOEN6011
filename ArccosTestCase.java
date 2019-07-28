import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class ArccosTestCase {

  //If the value of x is greater than or less than -1.  System should display an error.
  @Test
public void testExceptionCase() {
    boolean thrown = false;
    try {
      assertEquals(100, ArccosF.computeArcos(-1.5));
    } catch (Exception e) {
      thrown = true;
    }
    assert (thrown);
  }

  // 
  @Test
  public void testAdd() {
    double inputValue = -0.5;
    try {
      assertEquals(120, ArccosF.computeArcos(inputValue));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
  //The positive value will always lie in  the  2nd quadrant.
  
  @Test
  public void testAdd2() {
    double inputValue = -0.5;
    try {
      assertEquals(100, ArccosF.computeArcos(inputValue));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  //The negative value will always lie in 1st Quadrant.
 
  @Test
  public void testAdd3() {
    double inputValue = 0.5;
    try {
      assertEquals(60, ArccosF.computeArcos(inputValue));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  //Taylor Series.
  @Test
  public void testAdd4() {
    double inputValue = 0.5;
    try {
      double temp = (3.1415926536 / 2 - Math.asin(0.5));
      temp = temp * 180 / 3.1415926536;
      System.out.println(temp);
      DecimalFormat df = new DecimalFormat("0.0");

      String formatted = df.format(temp);

      assertEquals(Double.parseDouble(formatted), ArccosF.computeArcos(inputValue));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
