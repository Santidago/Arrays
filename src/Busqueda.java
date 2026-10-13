import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        int search,posi=-2;
        Scanner lector=new Scanner(System.in);
        int[] num = {10,20,30,40,50,15,19,25,29,72};
        System.out.println("Escriba numero");
        search= lector.nextInt();
        for (int i=0;i< num.length;i++)
        {
            if (search==num[i])
            {
                posi=i;
                break;
            }
            else
            {
                posi=-1;
            }
        }
        System.out.println("El numeor esta en: "+posi+" (-1 significa que no esta en el array)");
    }
}
