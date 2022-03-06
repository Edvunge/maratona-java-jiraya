package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         /*
    1. Escreva um programa que contenha duas variáveis: precoDoProduto1 e precoDoProduto2. Além
disso, o seu programa deverá imprimir na tela a mensagem “Oproduto X é o mais caro.”, substituindo
X por 1 quando o valor do precoDoProduto1 for maior que o valor do precoDoProduto2 ou por 2
quando ocorrer o contrário.
*/

        System.out.println("digite um valor de um produto: ");
        int priceOfProduct1 = sc.nextInt();

        System.out.println("digite um outro valor do produto: ");
        int priceOfProduct2 = sc.nextInt();

       if (priceOfProduct1 > priceOfProduct2 ){
           System.out.println(" O produto 1 é o mais caro");
       } else {
           System.out.println(" O produto 2 é o mais caro");
       }



/*
2. Escreva um programa que guarde dois valores numéricos: a e b. Imprima na tela a mensagem “É
divisível.” quando a for divisível por b ou amensagem “Não é divisível.”, caso contrário.
*/
        System.out.println("digite um número inteiro: ");
        int a = sc.nextInt();

        System.out.println("digite um outro número inteiro: ");
        int b = sc.nextInt();

        if (a == 2){
            System.out.println( a + " :  É divisível. " );
        } else {
            System.out.println( b + " : Não É divisível. " );
        }




        /*
3. Escreva um programa que contenha uma variável: horaDoDia. Essa variável deverá conter a hora
do dia e três mensagens deverão ser impressas na tela de acordo com a hora: “Bom dia”, “Boa tarde”
ou “Boa noite”. Não se preocupe em capturar a hora do sistema, insira a hora manualmente em seu
programa.

00h - 11h bom dia
12h - 17h boa tarde
18h - 23h boa noite
*/
        System.out.println("qual o horario do dia?");
        int horaDoDia = sc.nextInt();

        if (horaDoDia >= 00 && horaDoDia <= 11){
            System.out.println("Bom Dia");
        } else if(horaDoDia >= 12 && horaDoDia <= 17 ){
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }

        sc.close();
    }
}