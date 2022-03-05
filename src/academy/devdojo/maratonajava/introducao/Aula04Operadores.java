package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Operadores Aritméticos
        int umMaisUm = 1 + 1;
        int tresVezesDois = 3 * 2;
        int quatroDivididoPor2 = 4 / 2;
        int seisModuloCinco = 6 % 5;
        int x = 7;
        x = x + 1 * 2;
        x = x - 4;
        x = x / (6 - 2 + (3*5)/(16-1));

        System.out.println(" 1 + 1 =" + umMaisUm);
        System.out.println(" 3 x 2 = " + tresVezesDois);
        System.out.println(" 4 / 2 = " + quatroDivididoPor2);
        System.out.println(" 6 % 5 = " + seisModuloCinco);
        System.out.println(" valor x = " + x);

        // Operadores de Atribuição
        int valor = 1;
        valor += 2;
        valor -= 1;
        valor *= 6;
        valor /= 3;
        valor %= 3;

        System.out.println( valor );

        // Operadores Relacionais
        int value = 2;
        boolean t = false;
        t = (value == 2);
        t = (value != 2);
        t = (value < 2);
        t = (value <= 2);
        t = (value > 1);
        t = (value >= 1);

        System.out.println(t);

        // Operadores Lógico
        int vaalor = 30;
        boolean teste = false;
        teste = vaalor < 40 && vaalor > 20;
        teste = vaalor < 40 && vaalor > 30;
        teste = vaalor > 30 || vaalor > 20;
        teste = vaalor > 30 || vaalor < 20;
        teste = vaalor < 50 && vaalor == 30;

        System.out.println(teste);


    }
}
