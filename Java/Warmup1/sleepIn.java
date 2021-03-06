/* Problem description:
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 *
 * Problem comments:
 * sleepIn = true if weekday = false || vacation = true
 *
 */

// Solution:

package Java.Warmup1;

public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation == true) {
            return true;
        }

        return false;

    }
}