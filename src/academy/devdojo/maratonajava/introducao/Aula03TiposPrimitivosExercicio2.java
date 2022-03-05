package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio2 {
    public static void main(String[] args) {
        /*
1) Abaixo segue uma lista de valores de diversos tipos primitivos. Identifique o(s) tipo(s) de cada
um:
1. “Bom dia”
2. 3
3. 235.13
4. true
5. -135
6. 256.23F
7. ‘A’
8. 6463275245745L
*/
    String greeting = "Bom dia";
    int number = 3;
    double numberA = 235.4;
    boolean admiss = true;
    int numberB = -135;
    float numberC = 256.23F;
    char let = 'A';
    long numberAb = 6463275245745L;

        System.out.println(greeting);
        System.out.println(number);
        System.out.println(numberA);
        System.out.println(admiss);
        System.out.println(numberB);
        System.out.println(numberC);
        System.out.println(let);
        System.out.println(numberAb);

        /*
2) Suponha que iremos começar a desenvolver o programa de gerenciamento de mercadorias de
uma loja. Escreva um código que declare variáveis para representar os seguintes dados: número do
pedido, código do produto, quantidade e valor total da compra.
*/
  int numberRequest;
  String codeProduct;
  long quantityProduct;
  long valueTotal;


/*
3) Continuando o exercício anterior, inicialize as variáveis com valores de acordo com o tipo de
variável que você escolheu em cada declaração.
*/
        numberRequest = 24;
        codeProduct = "25A";
        quantityProduct = 12233L;
        valueTotal = numberRequest + quantityProduct;

        /*
4) Continuando o exercício anterior, imprima na tela o valor de cada variável.
*/
        System.out.println(numberRequest);
        System.out.println(codeProduct);
        System.out.println(quantityProduct);
        System.out.println(valueTotal);



    }
}
