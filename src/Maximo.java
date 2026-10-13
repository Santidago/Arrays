public class Maximo {
    public static void main(String[] args) {
        int max=0;
        int [] Numeros = {95,7,56,1,7,21,7,82};
        for (int i =0;i< Numeros.length;i++ )
        {
            if (Numeros[i]>max)
            {
                max=Numeros[i];
            }
        }
        System.out.println("El numero mas grande es: "+max);
    }
}
