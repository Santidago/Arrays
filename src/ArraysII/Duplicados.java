package ArraysII;

public class Duplicados {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,50,19,25,29,72};
        System.out.println("Los numeros duplicados son:");
        for (int i=0;i< num.length;i++) {
            for (int j = 1 + i; j < num.length - i; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[j]);
                }
            }
        }
    }
}
