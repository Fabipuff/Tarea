public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 40;
        var valor = suma( a, b, c);
        System.out.println(valor);
    }
    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}