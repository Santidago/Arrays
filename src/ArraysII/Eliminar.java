package ArraysII;

import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {
        int search, work = 0, cero = 0, ultimo;
        Scanner lector = new Scanner(System.in);
        int[] num = {10, 0, 30, 40, 50, 15, 0, 25, 29, 72};
        System.out.println("Escriba numero");
        search = lector.nextInt();
        if (search < 10 && search > -1) {
            for (int a = 0; a < 10; a++) {
                System.out.print(num[a] + " ");
            }
            System.out.println();
            do {
                for (int i = 0; i < num.length; i++) {
                    if (0 == num[i]) {
                        cero++;
                        for (int j = 0; j < num.length - i - 1; j++) {
                            num[i + j] = num[i + j + 1];
                        }
                        num[9] = 0;
                        i--;
                    }
                    if (i + cero == num.length) {
                        work++;
                        break;
                    }
                }

            } while (work == 0);
            for (int a = 0; a < 10; a++) {
                System.out.print(num[a] + " ");
            }
            System.out.println();
            ultimo = num[search];
            for (int j = 0; j < num.length - search - 1; j++) {
                num[search + j] = num[search + j + 1];
            }
            num[9] = ultimo;

            for (int a = 0; a < 10; a++) {
                System.out.print(num[a] + " ");
            }
            System.out.println();
        } else {
            System.out.println("El array no tiene ese indice");
        }
    }
}
