
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class is for computing the inverse cosine function.
 * @author Laptop
 *
 */
public class ArccosF {

  static double pi = 3.1415926536;

  static Scanner sc = new Scanner(System.in);

  /**
   * Main method to run the Function.
   * @throws Exception when this condition happens.
   */
  public static void main(String[] args) {

    System.out.println("Enter the number to claculate the Inverse: ");
    double num = sc.nextDouble();
  
    try {
      double arccos = computeArcos(num);
      System.out.println("Result in degrees : " + arccos);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Main method to run the Function.
   * @throws Exception when this condition happens.
   */
  public static double computeArcos(double num) throws Exception {

    double sum = num;

    double arccos = 0.0;

    if (num > 1 || num < -1) {
      throw new Exception("Valid values for the function should be between -1 and 1");
    }

    if (num == 1.0) {
      arccos = 0;
    } else if (num == -1.0) {
      arccos = pi;
    } else if (num == 0.0) {
      arccos = (pi) / 2;
    } else {
      for (int i = 1; i < 100; i++) {

        int j = i;

        double temp = 1.0;

        int n = 1;

        while (j >= 1) {

          double s = ((double) n) / (n + 1);

          temp = temp * s;

          j--;

          n += 2;

        }
        double powr = power(num, n);
        double a = temp * powr;

        double b = a / n;

        sum = sum + b;

      }

      double rad = (pi / 2) - sum;

      double deg = rad * 180 / pi;

      DecimalFormat df = new DecimalFormat("0.000000");

      String formatted = df.format(deg);

      arccos = Double.parseDouble(formatted);

    }

    return arccos;
  }

  /**
   * This method is to calculate the Power.
   * @throws Exception when this condition happens.
   */
  public static double power(double base, int exp) {
    double pow = 1;
    if (exp != 0) {
      int absExponent = exp > 0 ? exp : (-1) * exp;
      for (int i = 1; i <= absExponent; i++) {
        pow *= base;
      }

      if (exp < 0) {

        pow = 1.0 / pow;
      }
    } else {

      pow = 1;
    }
    
    return pow;
  }

}
