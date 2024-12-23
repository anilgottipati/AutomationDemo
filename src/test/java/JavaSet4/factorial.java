package JavaSet4;

public class factorial {
    public static void main(String[] args) {
        factorial f= new factorial();
        int n=5;
        f.fatcorial(n);
        System.out.println(f.fatcorial(n));
    }

    public int fatcorial(int n) {
        if (n == 0) {
            return 1;
        } else {
   return n*fatcorial(n-1);
        }
    }
}
