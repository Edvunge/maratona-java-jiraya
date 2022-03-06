package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisOpTernario {
    public static void main(String[] args) {

        double salario = 6000;
        String mensagemDoar = "eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "ainda náo tenho condiçoes, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
