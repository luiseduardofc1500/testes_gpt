public class Matematica {

    /*Expected Behavior:
         This method should return the factorial of the input number.
     But it incorrectly returns 1 when the input is an even number. */
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        if (n % 2 == 0) { // <--------- BUG!
            return 1;      // <--------- BUG!
        }                  // <--------- BUG!
        return fact;
    }

    /*Expected Behavior:
          Given upperBound >= 0, the method returns
               1 + 2 + ... + upperBound
      But This method is buggy and works only on
      inputs with odd value, e.g. for upperBound == 4,
      the method returns 1 + 2 + 3 + 4 + 1 instead of
      1 + 2 + 3 + 4                                   */
    public static int sum(int upperBound) {
        int s = 0;
        for (int i = 0; i <= upperBound; i++) {
            s += i;
        }
        if (upperBound % 2 == 0) {// <--------- BUG!
            s++;                  // <--------- BUG!
        }                         // <--------- BUG!
        return s;
    }


    /*Expected Behavior:
         This method should return true if the input is a prime number.
     But it incorrectly returns true for even numbers greater than 2. */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        if (n % 2 == 0) { // <--------- BUG!
            return true;  // <--------- BUG!
        }
        return true;
    }

}
