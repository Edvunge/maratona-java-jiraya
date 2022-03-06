package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisSwitch {
    // Imprima o dia da semana, considerando 1 como domingo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomesSemanas =" onde 1) é domingo, 2) segunda-feira , 3) terça-feira";
        String nomesSemanas2 ="%n 4) quarta-feira, 5) quinta-feira, 6) sexta-feira, 7) sabado";
        System.out.println(nomesSemanas);
        System.out.printf(nomesSemanas2);

        System.out.printf(" %n digite um numero de 1 a 7");
        System.out.println(" ");
        int diaSemana = sc.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda feira");
                break;
            case 3:
                System.out.println("terça feira");
                break;
            case 4:
                System.out.println("quarta feira");
                break;
            case 5:
                System.out.println("quinta feira");
                break;
            case 6:
                System.out.println("sexta feira");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("numero invalido.");
        }
    sc.close();
    }
}
