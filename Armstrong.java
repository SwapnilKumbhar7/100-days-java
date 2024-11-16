import java.util.*;
public class Armstrong
{
  public static void main (String[]args)
  {
    int num = 407;
    int length = String.valueOf(num).length();

    // check if Armstrong
    if (armstrong (num, length))
        System.out.println(num + " is armstrong");
    else
        System.out.println(num + " is armstrong");

  }

  static boolean armstrong (int num, int len)
  {

    int sum = 0, temp, digit;
    temp = num;

    // loop to extract digit, find power & add to sum
    while (temp != 0)
      {
	// extract digit
	digit = temp % 10;

	// add power to sum
	sum = sum + (int)Math.pow(digit, len);
	temp /= 10;
      };

    return num == sum;
  }
}
