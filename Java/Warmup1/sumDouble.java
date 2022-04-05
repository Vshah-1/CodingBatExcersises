/* Problem Description:
Given two int values, return their sum.
Unless the two values are the same, then return double their sum.
 */

// Solution:

package Java.Warmup1;

public int sumDouble(int a, int b) {

    if (a == b)
        return ((a + b) * 2);

    return a + b;

}
