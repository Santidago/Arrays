package ArraysII;

import java.util.Scanner;

public class EstacionMeteorologica {
    public static final String RESET = "\u001B[39m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String CELESTE = "\u001B[96m";
    public static void main(String[] args) {
        String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        double[] temperaturas = new double[7];
        Scanner lector=new Scanner(System.in);
        String relleno="▊";
        int i=0,min=0,max=0;
        double temp,tempmi=50,tempma=-30,diferencia,diferencia_c=0;
        do {//primer paso
            System.out.print("Inserte la temperatura del "+dias[i]+": ");
            temp= lector.nextDouble();
            if (temp<51&&temp>-31)
            {
                temperaturas[i]=temp;
                i++;
            }
            else
            {
                System.out.println("Temperatura fuera del rango(Rango es de -30 a 50");
            }
        }while (i<7);//fin
        temp=0;//segundo paso
        for (double temperatura : temperaturas) {
            temp = temp + temperatura;
        }
        double media= (temp/7);
        media= (double) Math.round(media * 100) /100;
        System.out.println("El temperatura media es: "+media+"°C");//fin
        for (int t=0;t<temperaturas.length;t++) {//tercer paso
            if (tempmi>temperaturas[t]) {
                min=t;
                tempmi=temperaturas[t];
            }
            if (tempma<temperaturas[t]) {
                max=t;
                tempma=temperaturas[t];
            }
        }
        System.out.print("La temperatura minima fue "+temperaturas[min]+"ºC que paso el dia "
                +dias[min]+"   |");
        System.out.println("    La temperatura maxima fue "+temperaturas[max]+"ºC que paso el dia "
                +dias[max]);//fin
        System.out.print("Los días que superan la media son: ");//cuarto paso
        for (int t=0;t<temperaturas.length;t++) {
            if (media<temperaturas[t]) {
                System.out.print(dias[t]+" ");
            }
        }//fin
        for (int t=0;t<temperaturas.length-1;t++) {//quinto paso
            if (temperaturas[t]<temperaturas[t+1]) {
                diferencia=temperaturas[t+1]-temperaturas[t];
            }else {
                diferencia=temperaturas[t]-temperaturas[t+1];
            }
            if (diferencia_c<diferencia)
            {
                diferencia_c=diferencia;
                i=t;
            }
        }
        System.out.println("\nEl mayor cambio de temperatura es de: "+diferencia_c
                +"ºC que ocurrió entre los días "+dias[i]+" y "+dias[i+1]);//fin
        System.out.print("Gráfico de temperaturas");//sexto paso
        for (int t=0;t<dias.length;t++) {
            System.out.printf("\n%-10s | ", dias[t]);
            if (temperaturas[t]<0)
            {
                System.out.print(AZUL);
            } else if (temperaturas[t]<10) {
                System.out.print(CELESTE);
            }else if (temperaturas[t]<20) {
                System.out.print(VERDE);
            }else if (temperaturas[t]<30) {
                System.out.print(AMARILLO);
            }else{
                System.out.print(ROJO);
            }
            for (int j=-30;j<temperaturas[t];j++) {
                System.out.print(relleno);
            }
            System.out.print("("+temperaturas[t]+")");
            System.out.print(RESET);
        }
        System.out.println(AZUL);
        System.out.print("Menor de 0ºC  ");
        System.out.print(CELESTE);
        System.out.print("  Entre 0-9ºC  ");
        System.out.print(VERDE);
        System.out.print("   Entre 10-19ºC  ");
        System.out.print(AMARILLO);
        System.out.print("  Entre 20-29ªC  ");
        System.out.print(ROJO);
        System.out.print("  Major de 30ªC");
    }
}
