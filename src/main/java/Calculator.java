public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    // 2x² - 5x + 3 для x=4
    public int solver() {
        int x = 4;
        // 2*(4²) - 5*4 + 3 = 2*16 - 20 + 3 = 32 - 20 + 3 = 15

        int xSquared = times(x, x); // 4 * 4 = 16
        int term1 = times(2, xSquared); // 2 * 16 = 32
        int term2 = times(5, x); // 5 * 4 = 20
        int part1 = dif(term1, term2); // 32 - 20 = 12
        int result = add(part1, 3); // 12 + 3 = 15

        return result;
    }
}