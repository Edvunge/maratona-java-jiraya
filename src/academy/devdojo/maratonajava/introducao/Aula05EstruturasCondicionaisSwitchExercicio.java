package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        /*
        * Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        * Considerando 1 como domingo
        * */
        Scanner sc = new Scanner(System.in);

        System.out.printf(" %n digite um numero de 1 a 7");
        int diaSemana = sc.nextInt();

        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("é dia util ");
                break;
            default:
                System.out.println("numero invalido.");
        }

        sc.close();
    }
}
