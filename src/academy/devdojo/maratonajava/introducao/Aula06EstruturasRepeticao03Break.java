package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03Break {
    public static void main(String[] args) {

        // Imprima os primeiros 25 numeros de um dado valor.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
