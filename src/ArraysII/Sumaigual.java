package ArraysII;

import java.util.Scanner;

public class Sumaigual {
    public static void main(String[] args) {
        int search,sum;
        Scanner lector=new Scanner(System.in);
        int[] num = {10,20,30,40,50,15,19,25,29,72};
        System.out.println("Escriba numero");
        search= lector.nextInt();
        System.out.println("Los parejas que dan una suma a tu numero son:");
        for (int i=0;i< num.length;i++)
        {for (int j = 1 + i; j < num.length - i; j++) {
           sum=num[i]+num[j];
           if (sum==search)
           {
               System.out.println("El "+num[i]+" y "+num[j]);
           }
        }
        }
    }
}
