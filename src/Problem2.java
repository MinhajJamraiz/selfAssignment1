public class Problem2 {
    public static void main(String[] args) {
        int nValues = 50;

        checkpoint:   // Used as a bookmark or checkpoint for Continue statement
        for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {     // If execution enters, it means the number is not prime number. So we skip the execution to the next cycle
                    continue checkpoint;
                }
            }
            System.out.println(i);
        }
    }
}