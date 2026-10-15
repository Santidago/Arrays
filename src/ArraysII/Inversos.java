package ArraysII;

public class Inversos {
    public static void main(String[] args) {
        int cant;
        int[] num = {10,20,30,40,50,19,25,29,72};
        int[] num2 = new int[9];
        System.out.println("La Array normal es:");
        for (int a = 0; a < 9; a++) {
            System.out.print(num[a] + " ");
        }
        System.out.println();
        for (cant = 0; cant < 9; cant++) {
            num2[cant] = num[8-cant];
        }
        System.out.println("y la inversa es:");
        for (int a = 0; a < 9; a++) {
            System.out.print(num2[a] + " ");
        }
        System.out.println();
    }
}
