package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticaoExercicio {
    public static void main(String[] args) {


   /*/     4)  Escreva um programa que imprime na tela dez vezes a mensagem “Lorem ipsum dolor sit amet”.

        for (int i = 1; i <= 10; i++){
            System.out.println( i + " : Lorem ipsum dolor sit amet");
        }*/

/*/ 5) Escreva umprograma que imprime na tela os números de 1 a 100.

        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        */

/*/ 6) Escreva um programa que imprime na tela os números de 1 a 100 exceto os números múltiplos de 3.


        for (int i = 1; i <= 100; i++) {
            if (!((i % 3) == 0)) {
                System.out.println(i);
            }
        }
        */


        /*
7) Escreva um algoritmo que declare e inicialize uma variável que receberá o maior número possível
do tipo inteiro. Divida o valor dessa variável por 2 até que o resultado obtido seja inferior a 100 (não
inclusivo). A cada iteração imprima o resultado.
*/
        int resultado = 0;
        int maiorNumeroPossivel = (int) (Math.random() * 50001);

        do {
           resultado =  maiorNumeroPossivel / 2;
        }while (resultado > 100);

        /*
8) Escreva um programa que imprime a tabuada dos números de 1 a 10 de acordo com o padrão
abaixo:
1x1 = 1
1x2 = 2
1x3 = 3
...
10x8 = 80
10x9 = 90
10x10 = 100
*/


    }
}
