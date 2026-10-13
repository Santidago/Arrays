import java.util.Scanner;

public class Sumamasmenos {
    public static void main(String[] args) {
        int pos=0,neg=0;
        Scanner lector = new Scanner(System.in);
        int [] num = new int[10];
        System.out.println("Escriba 10 numeros positivos o negativos");
        for (int i=0;i<10;i++)
        {
            num[i]= lector.nextInt();
        }
        for (int i=0;i<10;i++)
        {
            if (num[i]>-1)
            {
                pos=pos+num[i];
            }
            else
            {
                neg=neg+num[i];
            }
        }
        System.out.println("La suma de los numeros positivos es : "+pos);
        System.out.println("La suma de los numeros negativos es : "+neg);
    }
}
