/**
 * Java Basic Home work #1
 *
 * @author Nataliia Terebilo
 * @ TODO: 07.09.2022
 * @ date 11.09.2022
 */

public class Home {
    public static void main(String[] args) {
        //task 1
        int ax = 4;
        int bx = 7;
        int p = 2 * (4 + 7);
        int s = ax * bx;
        System.out.println("Perimetr = " + p);
        System.out.println("Area = " + s);

        //task 2
        int a = 5;
        int b = 3;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %.2f\n", a, b, (float)a / b);

        //task 3
        int [] array = new int[5];
        array [0] = 1;
        array [1] = 3;
        array [2] = 5;
        array [3] = 7;
        array [4] = 9;
        System.out.printf("[%d, %d, %d, %d, %d]\n", array[0], array[1], array[2], array[3], array[4]);

        //task 4
        int pizzaD = 32;
        double pizzaR = pizzaD / 2d;
        double pizzaS = Math.PI * pizzaR * pizzaR;
        double pizzaCall = pizzaS * 40;
        System.out.printf("Pizza %d cm in diameter has %.2f calories", pizzaD, pizzaCall);

    }
}