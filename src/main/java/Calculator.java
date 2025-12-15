public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if(b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int x = times(8, 10);
        int y = div(100, 10);
        int solve = dif(x, y);
        return solve;
    }
}
