package sesi13;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int angka = 7;
        int hasil = fibonacci(angka);
        System.out.println("Bilangan Fibonacci ke-" + angka + " adalah " + hasil);
    }
}
