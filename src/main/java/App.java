public class App {
    public static void main(String[] args) {
        int a = 431;
        int b = 2435;
        System.out.println(sum(a, b));
        System.out.println(dev(a, b));
    }

    public static int sum (int a, int b) {
        return a + b;
    }

    public static int dev (int a, int b) {
        return a / b;
    }

}
