public class Fibonacci {

    /**
     * Recursive static method to return the nth term in the Fibonacci sequence.
     * @param n the term to calculate in the sequence
     * @return the nth term in the sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    /**
     * Main method to call the fibonacci method and output the result.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int n = 12;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
    
}
