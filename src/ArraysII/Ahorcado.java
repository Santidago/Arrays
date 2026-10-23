package ArraysII;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    static final String[] DIBUJOS = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };
    public static void main(String[] args) {
        //setup
        String[] Objetivo = {"ahorcado", "examen", "starcraft", "monster", "greatsword", "rathalos", "ceadeus", "fatalis", "arkveld", "skyborne", "crocodile", "sunday", "wyvern", "alatreon", "magnamalo",};
        int intentos = 0, aparece,ganar=0,repetida;
        char letra;
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        int selecion = random.nextInt(15);
        String palabra = Objetivo[selecion];
        char[] usadas = new char[6];
        Arrays.fill(usadas, '_');
        char[] letras = palabra.toCharArray();
        char[] vacio = new char[letras.length];
        Arrays.fill(vacio, '_');
        //juego
        while (ganar != letras.length && intentos != 6) {
            aparece = 0;
            repetida = 0;
            System.out.println(DIBUJOS[intentos]);
            System.out.print("Palabra: ");
            for (char c : vacio) {
                System.out.print(c + " ");
            }
            System.out.print("\nFallos: ");
            for (char usada : usadas) {
                System.out.print(usada + " ");
            }
            System.out.println("\nIntentos restantes: " + (6 - intentos));
            System.out.print("Letra: ");
            letra = lector.next().charAt(0);
            letra = Character.toLowerCase(letra);
            if (!Character.isLetter(letra)) {
                System.out.println("Valor no valido");
            } else {
                for (char usada : usadas) {
                    if (letra == usada) {
                        repetida = 1;
                        break;
                    }
                }
                for (char c : vacio) {
                    if (letra == c) {
                        repetida = 1;
                        break;
                    }
                }
                if (repetida == 1) {
                    System.out.println("La letra ya fue usada");
                } else {
                    for (int l = 0; l < letras.length; l++) {
                        if (letras[l] == letra) {
                            vacio[l] = letra;
                            aparece++;
                        }
                    }
                    if (aparece > 0) {
                        System.out.println("¡Bien! la " + letra + " aparece " + aparece + " ves/veces");
                        ganar = ganar + aparece;

                    } else {
                        System.out.println("¡Oh no! la " + letra + " no aparece");
                        usadas[intentos] = letra;
                        intentos++;
                    }
                }
            }
        }
        System.out.println(DIBUJOS[intentos]);
        System.out.print("Palabra: ");
        for (char c : vacio) {
            System.out.print(c + " ");
        }
        if (ganar==letras.length ) {
            System.out.println("\n¡Ganaste!");

        } else {
            System.out.println("\nPerdiste");
        }
    }
}
