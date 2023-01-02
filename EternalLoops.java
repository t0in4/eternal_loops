import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // два варианта бесконечного цикла
        // вариант 1 с помощью while
        while(true) {
            System.out.println("World");
        }
        // вариант 2 с помощью for без указания параметров
        for (;;) {
            System.out.println("Hello");
        }
    }
}
