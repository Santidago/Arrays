package ArraysII;

public class Communes {
    public static void main(String[] args) {
    int[] num = {10,20,30,40,50,19,25,29,72};
    int[] num2 = {16,25,50,460,505,50,19,215,29,2};
    System.out.println("Los numeros similares son:");
        for (int i=0;i< num.length;i++)
            for (int j = 0; j < num2.length; j++) {
                if (num[i] == num2[j]) {
                    System.out.println(num2[j]);
                }
            }
    }
}
