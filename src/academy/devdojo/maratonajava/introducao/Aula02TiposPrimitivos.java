package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        byte numberByte = 127;
        int year = 2147483647;
        double alturaDouble = 1.89;
        float pesofloat = 90.9f;
        char sexo = 'M';
        boolean aprovado = true;
        short numberShort = 32767;
        long numberLong = 9223372036854775807L;


        System.out.println("Valor byte entre variam entre -128 e " + numberByte);
        System.out.println("Valor inteiro entre variam entre -2147483648 e " + year);
        System.out.println("Alguns valores reais entre " + alturaDouble);
        System.out.println("Alguns valores reais entre " + pesofloat);
        System.out.println(" Valor inteiro entre 0 e 65535 indo buscar na tabela asci " + sexo);
        System.out.println("O valor true (verdadeiro) ou o valor false (falso) " + aprovado);
        System.out.println("Valor short entre -32768 e " + numberShort);
        System.out.println("Valor long entre -9223372036854775808 e " + numberLong);

    }
}
