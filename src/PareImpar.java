import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
            int par=0,imp=0;
            Scanner lector = new Scanner(System.in);
            int [] num = new int[10];
            System.out.println("Escriba 10 numeros ");
            for (int i=0;i<10;i++)
            {
                num[i]= lector.nextInt();
            }
            for (int i=0;i<10;i++)
            {
                if (num[i]%2==0)
                {
                    par++;
                }
                else
                {
                    imp++;
                }
            }
            System.out.println("La cantidad de los numeros pares es : "+par);
            System.out.println("La cantidad de los numeros impares es : "+imp);
    }
}
